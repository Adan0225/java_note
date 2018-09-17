import java.io.File;
import java.io.IOException;
class exam2
{
	public static void main(String args[])

	{
        File f1= new File("/home/adan/a.txt");
        try
        {
        f1.createNewFile();
        }

        catch(IOException e)
        {
        	System.out.println("無新增權限");
        }
	}
}