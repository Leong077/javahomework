package getFile;
import java.util.ArrayList;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

public class hash {
	public static byte[] SHA1Checksum(InputStream is) throws Exception {
        // 用于计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];
        // 使用SHA1哈希/摘要算法
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;
        do {
            // 读出numRead字节到buffer中
            numRead = is.read(buffer);
            if (numRead > 0) {
                // 根据buffer[0:numRead]的内容更新hash值
                complete.update(buffer, 0, numRead);
            }
            // 文件已读完，退出循环
        } while (numRead != -1);
        // 关闭输入流
        is.close();
        // 返回SHA1哈希值
        return complete.digest();
    }
	
	//深度遍历
	public static void dfs(String path) {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        File data=new File("E:/data.txt");
        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isFile()) {
                System.out.println("file " + fs[i].getName());
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName());
            }
        }
    }
	
	//先将文件写入data.txt，再读取其hash值
	//原本的想法是将文件读取进数组，再将数组保存至新创建的txt文件中，之后再读取txt文件的hash值，但未能实现
    public static void main(String[] args) {
        try {
            File file = new File("E:/data.txt");
            dfs("E:/learnjava");
            
            FileInputStream is = new FileInputStream(file);
            
            byte[] sha1 = SHA1Checksum(is);

            String result = "";
            for (int i = 0; i < sha1.length; i++) {
                result += Integer.toString(sha1[i], 16);
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
