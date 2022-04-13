public class main {
    public static void main(String[]arg){
        char value ='A';
        switch(value){
            case 'A':
                System.out.println("the character is A");
                break;
            case 'B':
                System.out.println("the char is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("the char is "+value);
                break;
            default:
                System.out.println("char is above E");
                break;
        }
    }
}
