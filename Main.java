public class Main {
    static void frekans(int [] arr){
        int pointer = -20;
        for(int i = 0; i<arr.length; i++){
            int sayac =0;
            int tekrarSayi = arr[i];
            if(tekrarSayi == pointer){
                continue;
            }
            for(int k =0; k<arr.length; k++){
                if(tekrarSayi == arr[k]){
                    sayac++;
                    arr[k] = pointer;
                }
            }
            System.out.println(tekrarSayi + " " + sayac + " kere tekrar edildi.");
        }
    }
    public static void main(String[] args) {
        int [] list  = {10,20,20,30,30,30,40,50,50,65};
        System.out.print("Dizi: ");
        for(int i = 0; i<list.length; i++){
            if(i==0){
                System.out.print("[");
            }
            if(i == list.length-1){
                System.out.println(list[i] + "]");

            }else{
                System.out.print(list[i]+", ");
            }

        }
        frekans(list);
    }
}