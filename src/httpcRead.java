import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class httpcRead {
	
	public static void main(String[] args){
		
		Scanner a = new Scanner(System.in);
		while(true) {
			System.out.println("Command : ");
			String cmd = a.nextLine();
			String[] kwords = cmd.split(" ");
			int noOfKwords = kwords.length;
			
			for(int i=0;i<noOfKwords;i++) {
				kwords[i] = kwords[i].trim();
			}
			int flag=0;
			int j=0;
			String msg = null;
			do {
				if(kwords[j].compareTo("httpc") == 0) {
					j++;
					switch(kwords[j]) {
						case "help":
							try {
								j++;
								if(j < noOfKwords) {
									if(kwords[j].compareTo("get") == 0 && noOfKwords == 3) {
										System.out.println("httpc help get");
										flag=1;
										break;
									}else if(kwords[j].compareTo("post") == 0 && noOfKwords == 3) {
										System.out.println("httpc help post");
										msg = "help post";
										flag=1;
										break;
									}else {
										System.out.println("[1]Invalid command.");
										flag=1;
										break;
									}
								}else {
									System.out.println("httpc help");
									msg = "help";
									flag=1;
									break;
								}
							}catch(Exception e){}
							break;
						case "get":
							try {
								j++;
								if(j < noOfKwords) {
									if(noOfKwords == 3) {
										System.out.println("httpc get url");
										msg = "get "+kwords[j];
										flag=1;
										break;
									}else if(kwords[j].compareTo("-v") == 0 && noOfKwords == 4) {
										System.out.println("httpc get -v url");
										msg = "get -v "+kwords[j+1];
										flag=1;
										break;
									}else {
										System.out.println("[2]Invalid command.");
										flag=1;
										break;
									}
								}else {
									System.out.println("[3]Invalid command.");
									flag=1;
									break;
								}
							}catch(Exception e){}
							break;
						case "post":
							try {
								
							}catch(Exception e){}
							break;
						default:
							System.out.println("[5]Invalid command.");
							flag=1;
							break;
					}
				}else {
					System.out.println("[6]Invalid command.");
					flag=1;
					break;
				}
				
			}while(flag==0);
		}
		
	}

}
