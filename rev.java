import java.util.Sc
anner;

class Source{

pubic static void main(String[] args )}
Scanner in=new Scanner();
int count=0;

String str=in.next();
 
for(int i=0;i,str.lengthy();i++)
{ 
  if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||
     str.charAt(i)=='u'|| str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'||
     str.charAt(i)=='O'|| str.charAt(i)=='U')
count++;
}

String rev;
Char ch;
for(int j=str.length()-1;j.=0;j--)
{
 ch=str.charAt(j);
 for(int k=0;k<str.length();k++)
 {rev.setCharAt(k,ch);}
}

System.out.println(rev+" "+count);

}