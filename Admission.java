import java.util.Scanner;
/**
 * ABC수족관 입장료 처리 프로그램
 * 
 * @author (2017315002 김아름, 2017315038 이수정, 2018315051 키타야마 요시카) 
 * @version (2019.05.29)
 */
public class Admission
{
    /**
     * 나이를 입력받는 메소드
     * 
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //나이를 입력받아 age에 저장한다
        System.out.print("나이를 입력해 주세요. >> ");
        int age = scanner.nextInt();
        scanner.close();
        int fee = AdmissionCalculator(age);
        System.out.println("입장료는 " + fee + "원입니다.");
    }
    
    /**
     * 나이를 입력받으면 입장료를 계산하여 반환하는 메소드
     * 
     * @param age 나이
     * @return fee 입장료 반환
     */
    public static int AdmissionCalculator(int age){      
        int fee = 0;
        if(age >=0 && age <= 3){
            fee = 0;
        }
        else if(age >= 4 && age <= 7){
            fee = 400;
        }
        else if(age >= 7 && age <= 15){
            fee = 900;
        }
        else if(age >=16 && age <= 130){
            fee = 2000;
        }
        else{
            fee = 999999;
        }
        return fee;
    }
}