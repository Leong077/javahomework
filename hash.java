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
        // ���ڼ���hashֵ���ļ�������
        byte[] buffer = new byte[1024];
        // ʹ��SHA1��ϣ/ժҪ�㷨
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;
        do {
            // ����numRead�ֽڵ�buffer��
            numRead = is.read(buffer);
            if (numRead > 0) {
                // ����buffer[0:numRead]�����ݸ���hashֵ
                complete.update(buffer, 0, numRead);
            }
            // �ļ��Ѷ��꣬�˳�ѭ��
        } while (numRead != -1);
        // �ر�������
        is.close();
        // ����SHA1��ϣֵ
        return complete.digest();
    }
	
	//��ȱ���
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
	
	//�Ƚ��ļ�д��data.txt���ٶ�ȡ��hashֵ
	//ԭ�����뷨�ǽ��ļ���ȡ�����飬�ٽ����鱣�����´�����txt�ļ��У�֮���ٶ�ȡtxt�ļ���hashֵ����δ��ʵ��
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
