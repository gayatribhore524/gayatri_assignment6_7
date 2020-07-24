import java.io.*; 
import java.util.*;
class File 
{ 
static final int MAX_CHAR=256;
static int countChar(String s) 
{

int c[] = new int[MAX_CHAR]; 
int len = s.length(); 
for (int g = 0; g < len; g++) 
            c[s.charAt(g)]++; 
char chz[] = new char[s.length()]; 
for (int g = 0; g < len; g++) 
{ 
chz[g] = s.charAt(g); 
int find = 0; 
 for (int h = 0; h <= g; h++) { 
 if (s.charAt(g) == chz[h])  
                    find++;               
 } 
if (find == 1)  
System.out.println("Number of Occurrence of " + 
s.charAt(g) + " is:" + c[s.charAt(g)]);             
}
return 0;  
}
public static void main(String[] args) throws IOException 
{ 

String s = "File handling in Java implies reading from and writing data to a file"+"The File class from the java io package "+"allows us to work with different formats of files" + " In order to use the File class "+ " you need to create an object of the class and " + "specify the filename or directory name";
FileWriter fw=new FileWriter("text.txt");  
for (int i = 0; i < s.length(); i++) 
fw.write(s.charAt(i));
System.out.println("Writing successful"); 
fw.close();
int ch; 
FileReader fr=null; 
try{ 
fr = new FileReader("text.txt"); 
} 
catch (FileNotFoundException fe) 
{ System.out.println("File not found"); 
} 
int vowels=0,consonants=0,p=0;
while ((ch=fr.read())!=-1)
{
}
int count = 0,count1=0;    
char ch1;            
s=s.toLowerCase();   
for(int k = 0; k < s.length(); k++) {    
            if(s.charAt(k) != ' ')    
            {
               count++;
            }    
            if(s.charAt(k) == 'a' || s.charAt(k) == 'e' || s.charAt(k) == 'i' || s.charAt(k) == 'o' || s.charAt(k) == 'u') {  
                vowels++;
            }
            else
            {
            consonants++;
            }
}
char ch2[]= new char[s.length()];     
for(int q=0;q<s.length();q++)  
            {  
                ch2[q]= s.charAt(q);  
                if( ((q>0)&&(ch2[q]!=' ')&&(ch2[q-1]==' ')) || ((ch2[0]!=' ')&&(q==0)) )  
                    count1++;  
            }   
System.out.println(" characters in a string: " + count);
System.out.println(" vowels  = " +vowels);
System.out.println("consonants = " +consonants);
System.out.println(" words in test.txt file is= " +count1);
countChar(s);
fr.close(); 
} 
}