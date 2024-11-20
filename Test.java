class Test
{
    public static void main(String[] args) {
        {
    int i=8;
    
        try
        {
            i++;
        }
        catch(Exception e)
        {
            i++;
        }
        finally
        {
            i++;
        }
    
        System.out.println(i);
    }
}
}


