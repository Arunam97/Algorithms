class HelloWorld 
{
    public String func1() 
    {
        return "func1 says Hello World! It is being called using an object of the class as it is a non-static function.";
    }
    public static String func2() 
    {
        return "func2 says Hello World! It is being called from the class itself as it is a static function.";
    }
    public static String func3() 
    {
        return "func3 says Hello World! It is being a called by an object even though it is a static function.";
    }
    
    public static void main (String[] args)
    {
        System.out.println("Non-static functions must be called using objects as they belong to the instance of the class not the class itself.");
        HelloWorld obj = new HelloWorld();
        System.out.println(obj.func1());
        
        System.out.println("Static functions can be called either way as they belong to the class.");
        System.out.println(func2());
        System.out.println(obj.func3());
    }
}