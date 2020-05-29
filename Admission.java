import java.util.Scanner;
/**
 * ABC수족관 입장료 처리 프로그램
 * 
 * @author (2017315002 김아름, 2017315038 이수정, 2018315051 키타야마 요시카) 
 * @version (2019.05.29)
 */
public class Admission
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //나이를 입력받아 age에 저장한다
        System.out.print("나이를 입력해 주세요.");
        int age = scanner.nextInt();
        scanner.close();
    }
    public void AdmissionCalculator(int age){
        if (age >= 16){
            System.out.println("성인 요금은 2000원 입니다.");
            
        }
        else if (age >= 7){
            System.out.println("초등학생 및 중학생의 요금은 900원입니다.");
            return 900;
        }
        else if (age >= 4){
         return 400;   
        }
        else if(age < 4){
         return 0;   
        }
    }
}