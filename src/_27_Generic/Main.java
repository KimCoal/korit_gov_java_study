package _27_Generic;

public class Main {
    public static void main(String[] args) {

//        ResponseData responseData = new ResponseData();
//
//        responseData.setData1("어떠한 데이터");
//        responseData.setMessage("String message");
//        System.out.println(responseData.toStringStr());

        ResponseData<String> responseData1 = new ResponseData<>();
        responseData1.setMessage("123");
        responseData1.setData("asdasd");
        // 이때 responseData1의 멤버변수 data는 String이 된다
        ResponseData<Integer> responseData2 = new ResponseData<>();

        ResponseData<ResponseData> responseData = new ResponseData<>();
        responseData.setData(responseData1);
        System.out.println(responseData.getData());

        String str = GenericEx.identify("hello");
        Integer num = GenericEx.identify(123);
        System.out.println(str);
        System.out.println(num);

        int num1 = 123123;
        System.out.println(GenericEx.identify(num1));

    }
}
