class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

    HashSet<Character> s=new HashSet<>();
    for(int i=0;i<allowed.length();i++)
    {
        s.add(allowed.charAt(i));
    }
int count=0;
for(String n:words)
{
    int flag=1;
    for(int i=0;i<n.length();i++)
    {
        if(!s.contains(n.charAt(i)))
        {
            flag=0;
            break;
        }
    }
    count+=flag;
}
return count;
    }
}