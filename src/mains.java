public class mains {

    public static void main(String[] args) {
    String occhio = ";scemo;beppe;scemo;enrico;mel;ytyty;";
    occhio = occhio.substring(1);
    String[] arreyDiStringhe = occhio.split(";");

        System.out.println(arreyDiStringhe.length);
    for(int i = 0; i < arreyDiStringhe.length; i++ ) {


        System.out.println(arreyDiStringhe[i]);
    }




    }
}
