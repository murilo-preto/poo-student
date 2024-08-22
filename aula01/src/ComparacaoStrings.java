public class ComparacaoStrings {
    public static void main(String[] args) {
        String a = "Hello";
        //String b = "Hello"; // a==b, Interning: endereço b busca cache para otimização e utiliza mesmo endereço que a
       //String b = new String("Hello"); // a!=b, Forçando não usar otimização, novo endereço é utilizado
       
        String b = "World";
        String c = a;

        System.out.println(a==b);
        System.out.println(a==c); // Compara endereço
        System.out.println(a.equals(c)); // Compara valores

    }
}
