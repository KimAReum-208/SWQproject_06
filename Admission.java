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
    public int AdmissionCalculator(int age){
        // 나이별로 입장료를 반환해 주는 메소드
        if (age >= 16){
            return 2000;
        }
        else if (age < 16 && age >= 7){
            return 900;
        }
        else if (age < 7 && age >= 4){
            return 400;
        }
        else{
            return 0;
        }
    }
    
}