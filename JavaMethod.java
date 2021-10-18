public class JavaMethod{

    public static void main(String[] args){
        human("Dwi, " , 20);
        pendidikan ("Akuntansi/UMSU, " , 5);
        checkAge(20);

    }
     static void human(String nama, int umur){
        System.out.println("nama :" + nama + "umur :" + umur);
    }
    static void pendidikan (String kampus, int semester){
        System.out.println("jurusan/kampus :" + kampus + "semester :" + semester );
    }
    static void checkAge(int age) {
        if (age < 19) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
