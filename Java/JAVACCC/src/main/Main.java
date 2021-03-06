package main;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static int js;
	static int level;
	static int selection;
	public static void main(String[] args) {
		System.out.println("CCC Past Contests");
		System.out.println("Junior Section or Senior");
		System.out.println("0.Junior");
		System.out.println("1.Senior");
		System.out.println("2.Random");
		System.out.println("3.Euler");

		Scanner scan = new Scanner(System.in); 
		js = scan.nextInt();
		if(js == 0){
			System.out.println("Junior");
			System.out.println("1. J1");
			System.out.println("2. J2");
			System.out.println("3. J3");
			System.out.println("4. J4");
			System.out.println("5. J5");
			Scanner s = new Scanner(System.in); 
			level = s.nextInt();
			if(level == 1){
				System.out.println(" ");
				System.out.println("1.Quadrant Selection");

				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					quadrantSelection();
				}
			}
			if(level == 2){
				System.out.println(" ");
				System.out.println("1.Shifty Sum");

				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					shiftySum();
				}

			}
			if(level == 3){
				
			}
			if(level == 4){
				System.out.println(" ");
				System.out.println("1. Favourite Times");
				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					favouriteTimes();
				}
			}
			if(level == 5){
				System.out.println(" ");
				System.out.println("1. Assigning Partners");

				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					assigningPartners();
				}
				if(selection == 2){
				}
			}

		}
		if(js == 1){
			System.out.println("Senior");
			System.out.println("1. S1");
			System.out.println("2. S2");
			System.out.println("3. S3");
			System.out.println("4. S4");
			System.out.println("5. S5");
			Scanner s = new Scanner(System.in); 
			level = s.nextInt();
			if(level == 1){
				System.out.println(" ");
				System.out.println("1.2009 Cool Numbers");
				System.out.println("2.2008 It's Cold Here");
				System.out.println("3.2017 Sum Game");
				System.out.println("4.2007 Federal Voting Age");
				System.out.println("5.2015 Zero it Out");
				System.out.println("6.2014 Party Invitation");
				System.out.println("7.2005 Snow Calls");

				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					coolNumber();
				}
				if(selection == 2){
					itsColdHere();
				}
				if(selection == 3){
					sumGame();
				}
				if(selection == 4){
					votingAge();
				}
				if(selection == 5){
					zeroOut();
				}
				if(selection == 6){
					partyInvitation();
				}
				if(selection == 7) {
					snowCalls();
				}

			}
			if(level == 2){
				System.out.println(" ");
				System.out.println("1. Huffman Encoding");
				System.out.println("2. TopYodeller");
				System.out.println("3. Boxes");
				System.out.println("4. Attack of the CipherTexts");
				System.out.println("5. High Tide, Low Tide");
				System.out.println("6. Aromatic Numbers");
				System.out.println("7. Multiple Choice");
				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					huffman();
				}
				if(selection == 2){
					topYodeller();
				}
				if(selection == 3){
					boxes();
				}
				if(selection == 4){
					cipher();
				}
				if(selection == 5) {
					tide();
				}
				if(selection == 6) {
					aromaticNumbers();
				}
				if(selection == 7) {
					multipleChoice();
				}
			}
			if(level == 3){
				System.out.println(" ");
				System.out.println("1. Friends");

				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					friends();
				}
			}
			if(level == 4){
				System.out.println(" ");
				System.out.println("1. Blood Distribution");
				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();
				if(selection == 1){
					bloodDistribution();
				}
			}
			if(level == 5){
				System.out.println("  ");
				System.out.println("1.Pinball Ranking");


				Scanner sc = new Scanner(System.in);
				selection = sc.nextInt();

				if(selection == 1){
					pinballRanking();
				}

			}
		}
		if(js == 2){
			System.out.println("  ");
			System.out.println("1. Sorting Algorithms ");
			System.out.println("2. Base Conversions ");

			int s;
			Scanner sc = new Scanner(System.in);
			selection = sc.nextInt();
			
			if(selection == 1){
				System.out.println("1. Slow Sort (Can handle 10000, 1-10000 in 1351ms)");
				System.out.println("2. Rand Sort (10 ints = 801ms between 1-10)");
				System.out.println("3. Collections.Sort(), Merge Sort (Can handle 10000, 1-10000 in 35ms)");
				System.out.println("4. Place Sort(1000 ints 1-10000 in 24ms)");
				Scanner a = new Scanner(System.in);
				s = a.nextInt();

				if(s == 1){
					slowSort();
				}
				if(s == 2){
					randSort();
				}
				if(s == 3){
					collectionsSort();
				}
				if(s == 4){
					placeSort();
				}
			}
			if(selection == 2){
				int m;
				System.out.println("1. Base 1");
				System.out.println("2. Base 2");
				System.out.println("3. Base 8");


				Scanner a = new Scanner(System.in);
				s = a.nextInt();
				if(s == 1){
					System.out.println("1. Base 1 -> Base 10");
					System.out.println("2. Base 10 -> Base 1");

					Scanner b = new Scanner(System.in);
					m = b.nextInt();
					if(m == 1){
						oneToTen();
					}
					if(m == 2){
						tenToOne();
					}
				}
				if(s == 2){
					System.out.println("1. Base 2 -> Base 10");
					System.out.println("2. Base 10 -> Base 2");

					Scanner b = new Scanner(System.in);
					m = b.nextInt();
					if(m == 1){
						twoToTen();
					}
					if(m == 2){
						tenToTwo();
					}
				}
				if(s == 3){
					System.out.println("1. Base 8 -> Base 10");
					System.out.println("2. Base 10 -> Base 8");

					Scanner b = new Scanner(System.in);
					m = b.nextInt();
					if(m == 1){
						eightToTen();
					}
					if(m == 2){
						tenToEight();
					}
				}
			}
			if(selection == 3){
				
			}
			if(selection == 4){
			}
			if(selection == 5){
			}
		}
		if(js == 3) {
			System.out.println("Project Euler");
			System.out.println("1. 1-15");
			System.out.println("2. 16-30");
			Scanner s = new Scanner(System.in); 
			level = s.nextInt();
			if(level == 1){
				System.out.println("First 15 Problems");
				System.out.println("C....1. Multiples of 3 and 5 below 1000");
				System.out.println("C....2. Even Fibonacci Numbers");
				System.out.println("IC...3. Largest Prime Factor");
				System.out.println("C....4. Largest Palindrome Factor");
				System.out.println("C....5. Smallest Multiple");
				System.out.println("C....6. Sum Square Difference");
				System.out.println("C....7. 10 001st Prime");
				System.out.println("C....8. Largest Product in a Series");
				System.out.println("C....9. Pythagorean Triplet");
				System.out.println("C....10. Summation of Primes");
				System.out.println("IC...11. Largest Product in a Grid");

				Scanner a = new Scanner(System.in); 
				selection = a.nextInt();
				if(selection == 1) {
					System.out.println(" ");
					int total = 0;
					for(int i = 0;i < 1000;i++) {
						if(i % 3 == 0 || i % 5 == 0) {
							total += i;
						}
					}
					System.out.println(total);
				}
				if(selection == 2) {
					int i = 1;
//					int oi = 1;
					int f = 1;
					
					int n = 0;
					int total = 0;
					while(i < 4000000) {
						i = f + n;
						n = f;
						f = i;
						if(i % 2 == 0) {
							total += i;
						}
					}
					System.out.println(total);
				}
				if(selection == 4) {
					int max = 0;
					for(int i = 100;i < 999;i++) {
						for(int j = 100;j < 999;j++) {
							int product = i * j;
							if(palindromeNum(product) == true) {
								if(product > max) {
									max = product;
								}
							}
						}
					}
					System.out.println(max);
				//	System.out.println(palindromeNum(90109));
				}
				if(selection == 5) {
					for(int i = 1;i < Integer.MAX_VALUE;i++) {
						boolean b = true;
						for(int c = 1;c < 20;c++) {
							if(i % c != 0) {
							//	System.out.println(i);
								b = false;
							}
							
						}
						if(b == true) {
							System.out.println(i);
							break;
							
						}
					}
				}
				if(selection == 6) {
					int total = 0;
					int sum = 0;
					for(int i = 0;i < 101;i++) {
						total += i * i;
					}
					for(int i = 0;i< 101;i++) {
						sum += i;
					}
					System.out.print(sum * sum - total);
				}
				if(selection == 7) {
					int numPrimes = 0;
					for(int i = 1; i < Integer.MAX_VALUE;i++) {
						boolean isPrime = true;
						for(int j = 2;j < (i/2) + 1;j++) {
							if(i % j == 0) {
								isPrime = false;
							}
						}
						if(isPrime) {
							numPrimes++;
							if(numPrimes == 10002) {
								System.out.println(i);
								break;
							}
						}
					}
				}
				if(selection == 9) {
					boolean broke = false;
					int c = 0;
					int b = 0;
					int A = 0;
					for(int i = 0;i < 1000;i++) {
						for(int j = i;j < (1000-i);j++) {
							A = i;
							b = j;
							c = 1000 - A - b;
							if(c > b && b > A) {
								double py = Math.sqrt((A * A) + (b * b));
								if(py == c) {
									System.out.println("A: " + A + " B: " + b + " C: " + c);
									broke = true;
									break;
								}
							}
						}
						if(broke) {
							break;
						}
					}
				}
				if(selection == 10) {
					long total = 2;
					for(int i = 3;i < 2000000;i++) {
						if(isPrime(i)) {
							total += i;
							System.out.println(i);
						}
					}
					System.out.println(total);
				}
				if(selection == 11) {
					String input = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08\r\n" + 
							"49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00\r\n" + 
							"81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65\r\n" + 
							"52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91\r\n" + 
							"22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80\r\n" + 
							"24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50\r\n" + 
							"32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70\r\n" + 
							"67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21\r\n" + 
							"24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72\r\n" + 
							"21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95\r\n" + 
							"78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92\r\n" + 
							"16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57\r\n" + 
							"86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58\r\n" + 
							"19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40\r\n" + 
							"04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66\r\n" + 
							"88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69\r\n" + 
							"04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36\r\n" + 
							"20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16\r\n" + 
							"20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54\r\n" + 
							"01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48\r\n" + 
							"\r\n" + "";
					String[] strArray = input.split("\r\n");
				//	String[] chrArray = new String[400];
					int[] intArray = new int[strArray.length];
					for(int i = 0; i < strArray.length; i++) {
						String[] tmpArray = strArray[i].trim().split("\\s*,\\s*");
						System.out.println(tmpArray[0]);
				//	    intArray[i] = Integer.parseInt(strArray[i]);
					}

				}
				
				
			}
			if(level == 2) {
				System.out.println("Problems 16 to 30");
				System.out.println("C....16. Power Digit Sum");
				Scanner a = new Scanner(System.in); 
				selection = a.nextInt();

				if(selection == 16) {
					BigInteger total = new BigInteger("0");
					BigInteger in = new BigInteger("2").pow(1000);
					System.out.println(in);

					LinkedList<BigInteger> list = getDigits(in);
					System.out.println(list);
					for(int i = 0;i < list.size();i++) {
						total = total.add(list.get(i));
	//					System.out.println(list.get(i));
					}
					System.out.println(total);
				}
			}
		}
	}
	static void coolNumber(){
		int num = 0;
		int min = 0;
		int max = 0;
		System.out.println("Minimum");
		Scanner s = new Scanner(System.in);
		min = s.nextInt();
		System.out.println("Maximum");
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt();
		for(double i = min;i < max;i++){
			
			if(Math.floor(Math.pow(i, 1.0/2.0) * 1000 + 0.5)/1000 % 1.0 == 0){
				if(Math.floor(Math.pow(i, 1.0/3.0) * 1000 +0.5 )/1000 % 1.0 == 0){
					num++;
				}
			}
		}
		System.out.println("There are " + num);
	}
	static void itsColdHere(){
		int temp[];
		String city[];
		city = new String[10000];
		temp = new int[10000];
		int index = 0;
		int coldest = 0;
		System.out.println("List the Cities");
		int i = 0;
		while(true){
			Scanner s = new Scanner(System.in);
			city[i] = s.next();
			temp[i] = s.nextInt();
			if(temp[i] < coldest){
				coldest = temp[i];
				index = i;
			}
			if(city[i].equals("Waterloo")){
				break;
			}
			i++;
		}
		System.out.println(city[index]);
	}
	static void sumGame(){
		int high = -1;
		int numGames;
		System.out.println("Number of Games");
		Scanner sc = new Scanner(System.in);
		numGames = sc.nextInt();
		int f[] = new int[numGames];
		int s[] = new int[numGames];
		int one = 0;
		int two = 0;

		Scanner first = new Scanner(System.in);
		for(int i =0; i < numGames;i++){
			f[i] = first.nextInt();
		}
		Scanner second = new Scanner(System.in);
		for(int i =0; i < numGames;i++){
			s[i] = second.nextInt();
		}
		for(int i =0; i < numGames;i++){
			one += f[i];
			two += s[i];
			if(one == two){
				high = i;
			}
		}
		if(high == -1){
			System.out.println(0);
		}
		else{
			System.out.println(high + 1);
		}
	}
	static void huffman(){
		int num;
		System.out.println("Number of characters");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		String ch[] = new String[num];
		String bin[] = new String[num];
		String binary;
		String curr = "";
		for(int i =0;i < num;i ++){
			Scanner sc = new Scanner(System.in);
			ch[i] = sc.next();
			bin[i] = sc.next();
		}
		Scanner c = new Scanner(System.in);
		binary = c.next();
		for(int i = 0; i< binary.length();i++){
			curr += binary.charAt(i);
			for(int k = 0;k < num;k++){
				if(bin[k].equals(curr)){
					curr = "";
					System.out.print(ch[k]);
				}
			}
		}
		
	}
	static void votingAge(){
		int num;
		System.out.println("How many voters");
		Scanner a = new Scanner(System.in);
		num = a.nextInt();
		String output[] = new String[num];

		for(int i = 0;i < num;i++){
			Scanner b = new Scanner(System.in);
			int year,month,day;
			year = b.nextInt();
			month = b.nextInt();
			day = b.nextInt();
			if(2007 - year > 18){
				output[i] = "Yes";
			}
			else if(2007 - year < 18){
				output[i] = "No";
			}
			else{
				if(month > 2){
					output[i] = "Yes";
				}
				else if(month < 2){
					output[i] = "No";
				}
				else{
					if(day <= 27){
						output[i] = "Yes";
					}
					else if(day > 27){
						output[i] = "No";
					}
				}
			}
		}
		for(int i =0; i < num;i++){
			System.out.println(output[i]);
		}
	}
	static void topYodeller(){
		int times = 0;
		int players = 0;
		int highest = 0;
		int highestindex = 0;
		int lowest = Integer.MAX_VALUE;
		System.out.println("Number of Conteststants Number of Comps ex. 5 2");
		Scanner s = new Scanner(System.in);
		players = s.nextInt();
		times = s.nextInt();
		int arr[] = new int[players];
		for(int i = 0;i < times;i++){
			Scanner b = new Scanner(System.in);

			for(int a = 0;a < arr.length;a++){
				
				arr[a] += b.nextInt();
				if(arr[a] < lowest){
					lowest = a;
				}
			}

		}
		for(int i = 0; i < arr.length;i++){
			if(arr[i] > highest){
				highest = arr[i];
				highestindex = i;
			}
		}
		System.out.println("Yodeller " + (highestindex + 1) + " is the TopYodeller: score " + highest + ", worst rank " + (1 + lowest));

	}
	static void pinballRanking(){
		int num = 0;
		System.out.println("Number of Games");
		Scanner n = new Scanner(System.in);
		num = n.nextInt();
		int scores[] = new int[num];
		int ranks[] = new int[num];
		List<Integer> sorted=new ArrayList();
		Scanner s  = new Scanner(System.in);

		for(int i = 0;i < num;i++){
			int temp = 0;
			temp = s.nextInt();
			scores[i] = temp;
			sorted.add(temp);
			Collections.sort(sorted,Collections.reverseOrder());
			for(int k = 0;k < sorted.size();k++){
				if(temp == sorted.get(k)){
					ranks[i] = k;
				}
			}
			
			
		}
		
		float count = 0;
		for(int i = 0;i < ranks.length;i++){
			count += ranks[i];
		}
		System.out.printf("%.2f",(count/num) + 1);	
	}
	static void zeroOut(){
		int num;
		System.out.println("Number of Integers?");
		Scanner n = new Scanner(System.in);
		num = n.nextInt();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//Put all numbers into array list and 0 calculations
		for(int i = 0;i< num;i++){
			int temp = 0;
			Scanner s = new Scanner(System.in);
			temp = s.nextInt();
			if(temp == 0){
				list1.remove(list1.size() - 1);
			}
			else{
				list1.add(temp);
			}
		}
		//Sum arraylist
		int total = 0;
		for(int i = 0;i < list1.size();i++){
			total += list1.get(i);
		}
		System.out.println(total);
	}
	static void boxes(){
		int nBoxes;
		Scanner nB = new Scanner(System.in);
		nBoxes = nB.nextInt();
		int bl[] = new int[nBoxes];
		int bw[] = new int[nBoxes];
		int bh[] = new int[nBoxes];
		int vb[] = new int[nBoxes];
		for(int i = 0; i< nBoxes;i++){
			Scanner a = new Scanner(System.in);
			bl[i] = a.nextInt();
			bw[i] = a.nextInt();
			bh[i] = a.nextInt();
			vb[i] = bl[i] * bw[i] * bh[i];
		}
		int nItems;
		Scanner nI = new Scanner(System.in);
		nItems = nI.nextInt();
		int il[] = new int[nItems];
		int iw[] = new int[nItems];
		int ih[] = new int[nItems];
		String result[] = new String[nItems];

		for(int i = 0; i< nItems;i++){
			Scanner a = new Scanner(System.in);
			il[i] = a.nextInt();
			iw[i] = a.nextInt();
			ih[i] = a.nextInt();
		}
		Arrays.sort(vb);
		for(int i = 0; i < nItems;i++){
			for(int j = 0;j < nBoxes;j++){
				if(bl[j] >= il[i] && bw[j] >= iw[i] && bh[j] >= ih[i]){
					result[i] = Integer.toString(vb[j]);
					break;
				}
				else if(bl[j] >= il[i] && bw[j] >= ih[i] && bh[j] >= iw[i]){
					result[i] = Integer.toString(vb[j]);
					break;


				}
				else if(bl[j] >= iw[i] && bw[j] >= il[i] && bh[j] >= ih[i]){
					result[i] = Integer.toString(vb[j]);
					break;

				}
				else if(bl[j] >= iw[i] && bw[j] >= ih[i] && bh[j] >= il[i]){
					result[i] = Integer.toString(vb[j]);
					break;

				}
				else if(bl[j] >= ih[i] && bw[j] >= iw[i] && bh[j] >= il[i]){
					result[i] = Integer.toString(vb[j]);
					break;

				}
				else if(bl[j] >= ih[i] && bw[j] >= il[i] && bh[j] >= iw[i]){
					result[i] = Integer.toString(vb[j]);
					break;

				}
				else{
					result[i] = "Item does not fit";
				}
			}
			System.out.println(result[i]);
		}
		
		
		
		
	}
	static void friends(){
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int tags[] = new int[num];
		int connect[] = new int[num];
		for(int i = 0;i < num;i++){
	//		first[i] = 0;
			int x;
			int y;
			x = sc.nextInt();
			y = sc.nextInt();
			tags[i] = x;
			connect[i] = y;
		}
		while(true){
			int x,y;
		//	Scanner b =new Scanner(System.in);
			x = sc.nextInt();
			y = sc.nextInt();
			int xindex;
			if(x == 0 && y == 0){
				break;
			}
			int seperation = 0;
			xindex = getFriendIndex(tags,x);
			int curr = x;

			while(true){
				if(connect[getFriendIndex(tags,curr)] == y){
					System.out.println("Yes " + seperation);
					break;
				}
				else{
					seperation++;
					curr = connect[getFriendIndex(tags,curr)];
					if(curr == x){
						System.out.println("No");
						break;
					}
				}
			}
		}
	}
	static void cipher(){
		String first;
		String second;
		String third;
		String fourth = "";
		Scanner s = new Scanner(System.in);
		first = s.nextLine();
		second = s.nextLine();
		third = s.nextLine();
		char chars[] = new char[27];
		Arrays.fill(chars, '.');
		for(int i = 0;i < first.length();i++){
			chars[getCharInt(second.charAt(i))] = first.charAt(i);
		}
		for(int i = 0;i < third.length();i++){
			fourth += chars[getCharInt(third.charAt(i))];
		}
		System.out.println(fourth);
	}
	static void partyInvitation(){
		int total;
		Scanner t = new Scanner(System.in);
		total = t.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i< total;i++){
			list.add(i);
		}
	}
	static void quadrantSelection(){
		int first,second;
		System.out.println("First Int");
		Scanner a = new Scanner(System.in);
		first = a.nextInt();
		System.out.println("Second Int");
		Scanner b = new Scanner(System.in);
		second = b.nextInt();
		if(first > 0 && second > 0){
			System.out.println(1);
		}
		if(first < 0 && second > 0){
			System.out.println(2);
		}
		if(first < 0 && second < 0){
			System.out.println(3);
		}
		if(first > 0 && second < 0){
			System.out.println(4);
		}


	}
	static void shiftySum(){
		int input = 0;
		int shift = 0;
		int fin = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		Scanner s = new Scanner(System.in);
		shift = s.nextInt();
		//fin += input;
		for(int i = 0;i < shift+1;i++){
			fin += input * Math.pow(10, i);
		}
		System.out.println(fin);
	}
	static void favouriteTimes(){
		int dur = 0;
		int h = 12;
		int t = 0;
		int m = 0;
		System.out.println("Duration");
		Scanner s = new Scanner(System.in);
		dur = s.nextInt();
		for(int i =0; i <= dur;i++){
			String hr;
			String min;
			int diff;
			m++;
			if(m == 60){
				h++;
				m = 0;
				if(h == 13){
					h = 1;
				}
			}
			hr = Integer.toString(h);
			if(m < 10){
				min = '0' + Integer.toString(m);
			}
			else{
				min = Integer.toString(m);

			}

			if(h == 12){
				diff = 1;
				if(-1 * (Character.getNumericValue(min.charAt(0)) - Character.getNumericValue(min.charAt(1))) == diff){
					if(-1 * (Character.getNumericValue(hr.charAt(1)) - Character.getNumericValue(min.charAt(0))) == diff){
						t++;
					}
				}

			}
			else if(h == 11){
				diff = 0;

				if(-1 * (Character.getNumericValue(min.charAt(0)) - Character.getNumericValue(min.charAt(1))) == diff){

					if(-1 * (Character.getNumericValue(hr.charAt(1)) - Character.getNumericValue(min.charAt(0))) == diff){
						t++;
					}
				}
			}
			else if(h == 10){
				diff = -1;

				if(-1 * (Character.getNumericValue(min.charAt(0)) - Character.getNumericValue(min.charAt(1))) == diff){

					if(-1 * (Character.getNumericValue(hr.charAt(1)) - Character.getNumericValue(min.charAt(0))) == diff){
						t++;
					}
				}
			}
			else{
				diff = -1 * (Character.getNumericValue(hr.charAt(0)) - Character.getNumericValue(min.charAt(0)));
				if(-1 * (Character.getNumericValue(min.charAt(0)) - Character.getNumericValue(min.charAt(1))) == diff){
					if(-1 * (Character.getNumericValue(hr.charAt(0)) - Character.getNumericValue(min.charAt(0))) == diff){
						t++;
					}
				}
			}
		}
		System.out.println(t);

	}
	static void assigningPartners(){
		int num = 0;
		System.out.println("How many names");
		Scanner n = new Scanner(System.in);
		num = n.nextInt();
		System.out.println("List the names");
		ArrayList<String> list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList();
		Scanner s = new Scanner(System.in);
		for(int i = 0;i < num;i++){
			list1.add(s.next());
		}
	//	Scanner sc = new Scanner(System.in);
		for(int i = 0;i < num;i++){
			list2.add(s.next());
		}
		Collections.reverse(list2);
		boolean error = false;
		for(int i = 0;i < num;i++){
			if(!list1.get(i).equals(list2.get(i))){
				error = true;
			}
		}
		if(error){
			System.out.println("bad");
		}
		if(!error){
			System.out.println("good");
		}
		
		
	}
	static void tide() {
		System.out.println("Input: ");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int measured[] = new int[length];
		int high[] = new int[length/2];
		int low[] = new int[length/2];
		int t[] = new int[length];
		for(int i = 0;i < length;i++) {
			measured[i] = s.nextInt();
		}
		Arrays.sort(measured);
		System.out.println(Arrays.toString(measured));


		for(int i = 0;i < length/2;i++) {
			low[i] = measured[i];
		}
		int increm = 0;
		for(int i = length/2;i < length;i++) {
			high[increm] = measured[i];
			increm++;
		}
		int i1 = 0;
		int i2 = 0;
		for(int i = 0;i < length/2;i++) {
			t[i] = low[length/2-i-1];
		}
		for(int i = 0;i < length;i++) {
			if(i%2 == 0) {
				System.out.print(t[i1] + " ");
				i1++;
			}
			else {
				System.out.print(high[i2] + " ");
				i2++;
			}
				
		}
	}
	static void snowCalls() {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		String[] input = new String[length];
		String[] output = new String[length];
		Scanner il = new Scanner(System.in);

		for(int i = 0;i < length;i++) {
			input[i] = il.nextLine();
		//	char[] temp = new char[input[i].length()];
			output[i] = "";
			int index = 0;
			int hyp = 0;
			for(int j = 0;j < input[i].length();j++) {
				if(index == 3 && hyp < 2) {
					output[i] += '-';
					index = 0;
					hyp++;
				}
				if(Character.isDigit(input[i].charAt(j))) {
					output[i] += input[i].charAt(j);
					index++;
				}
				else if(input[i].charAt(j) == 'A' || input[i].charAt(j) == 'B' || input[i].charAt(j) == 'C') {
					output[i] += '2';
					index++;
				}
				else if(input[i].charAt(j) == 'D' || input[i].charAt(j) == 'E' || input[i].charAt(j) == 'F') {
					output[i] += '3';
					index++;
				}
				else if(input[i].charAt(j) == 'G' || input[i].charAt(j) == 'H' || input[i].charAt(j) == 'I') {
					output[i] += '4';
					index++;
				}
				else if(input[i].charAt(j) == 'J' || input[i].charAt(j) == 'K' || input[i].charAt(j) == 'L') {
					output[i] += '5';
					index++;
				}
				else if(input[i].charAt(j) == 'M' || input[i].charAt(j) == 'N' || input[i].charAt(j) == 'O') {
					output[i] += '6';
					index++;
				}
				else if(input[i].charAt(j) == 'P' || input[i].charAt(j) == 'Q' || input[i].charAt(j) == 'R' || input[i].charAt(j) == 'S') {
					output[i] += '7';
					index++;
				}
				else if(input[i].charAt(j) == 'T' || input[i].charAt(j) == 'U' || input[i].charAt(j) == 'V') {
					output[i] += '8';
					index++;
				}
				else if(input[i].charAt(j) == 'W' || input[i].charAt(j) == 'X' || input[i].charAt(j) == 'Y' || input[i].charAt(j) == 'Z') {
					output[i] += '9';
					index++;
				}
				else if(input[i].charAt(j) == '-') {
					//Do Nothing
				}
				if(output[i].length() == 12) {
					break;
				}

			}
		}
		for(int i = 0; i < length;i++) {
			System.out.println(output[i]);
		}
	}
	static void aromaticNumbers() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int total = 0;
		for(int i = 0;i < input.length();i+=2) {
			int num = input.charAt(i) - '0';
			char div = input.charAt(i+1);
			int d = 0;
			if(div == 'I') {
				d = 1;
			}
			if(div == 'V') {
				d = 5;
			}
			if(div == 'X') {
				d = 10;
			}
			if(div == 'L') {
				d = 50;
			}
			if(div == 'C') {
				d = 100;
			}
			if(div == 'D') {
				d = 500;
			}
			if(div == 'M') {
				d = 1000;
			}
			char a = 'a';
			if(i + 3 < input.length()) {
				 a = input.charAt(i+3);
			}
			int o = 0;
			if(a == 'I') {
				o = 1;
			}
			if(a == 'V') {
				o = 5;
			}
			if(a == 'X') {
				o = 10;
			}
			if(a == 'L') {
				o = 50;
			}
			if(a == 'C') {
				o = 100;
			}
			if(a == 'D') {
				o = 500;
			}
			if(a == 'M') {
				o = 1000;
			}
			if(o > d) {
				total -= d * num;
			}
			else {
				total += d * num;
			}
		}
		System.out.println(total);
	}
	static void multipleChoice() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String[] input = new String[num];
		String[] answers = new String[num];
		int score = 0;
		for(int i = 0;i < num;i++) {
			input[i] = s.next();
		}
		for(int i = 0;i < num;i++) {
			answers[i] = s.next();
		}
		for(int i = 0;i < num;i++) {
			if(input[i].equals( answers[i])) {
				score++;
			}
		}
		System.out.println(score);
	}
	static void bloodDistribution() {
		Scanner s = new Scanner(System.in);
		int[] donors = new int[8];
		int[] ppl = new int[8];
	}
	//Sorting
	static void slowSort(){
		long mill;
		long fin;
		System.out.println("Number of Integers");
		int len = 0;
		Scanner n = new Scanner(System.in);
		len = n.nextInt();
		System.out.println("Your list of integers");
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i < len;i++){
			String temp;
			int t = 0;
			temp = s.next();
			t = Integer.parseInt(temp);
			list.add(t);
	//		System.out.println("FOREVER");
		}
		mill = System.currentTimeMillis();

		System.out.println("WORKING........");
		while(true){
		//	System.out.println(1);

			boolean changed = false;
			for(int i = 0;i < list.size();i++){
				if(i > 0){
					if(list.get(i) < list.get(i-1)){
						int small = list.get(i);
						int large = list.get(i-1);
						list.set(i,large);
						list.set(i-1, small);
						changed = true;
					}
				}
				
			}
			if(!changed){
				break;
			}
		}
		fin = System.currentTimeMillis() - mill;
		for(int i = 0;i < list.size();i++){
			System.out.println(" ");
			System.out.print(list.get(i) + " ");
		}
		System.out.println(" ");
		System.out.println("This took " + fin + "ms");
		//Verify
		boolean error = false;
		for(int i = 0;i < list.size();i++){
			if(i + 1 < list.size()){
				if(list.get(i) <= list.get(i + 1)){
					
				}
				else{
					System.out.println("Error at " + i);
					error= true;
				}
			}
		}
		if(!error){
			System.out.println("Verified No Errors");
		}
	}
	static void randSort(){
		long mill;
		long fin;
		System.out.println("Number of Integers");
		int len = 0;
		Scanner n = new Scanner(System.in);
		len = n.nextInt();
		System.out.println("Your list of integers");
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i < len;i++){
			String temp;
			int t = 0;
			temp = s.next();
			t = Integer.parseInt(temp);
			list.add(t);
	//		System.out.println("FOREVER");
		}
		mill = System.currentTimeMillis();

		System.out.println("WORKING........");
		while(true){
		for(int i = 0;i < len;i++){
			int x,y;
			int randnum;
			Random rand = new Random();
			randnum = rand.nextInt(len);
			x = list.get(i);
			y = list.get(randnum);
			list.set(i, y);
			list.set(randnum, x);
		
		}	
			boolean error = false;
			for(int i = 0;i < list.size();i++){
				if(i + 1 < list.size()){
					if(list.get(i) <= list.get(i + 1)){
						
					}
					else{
						//System.out.println("Error at " + i);
						error= true;
					}
				}
			}
			if(!error){
				break;
			}
			
		}
		fin = System.currentTimeMillis() - mill;
		for(int i = 0;i < list.size();i++){
			System.out.println(" ");
			System.out.print(list.get(i) + " ");
		}
		System.out.println(" ");
		System.out.println("This took " + fin + "ms");

	}
	static void collectionsSort(){
		long mill;
		long fin;
		System.out.println("Number of Integers");
		int len = 0;
		Scanner n = new Scanner(System.in);
		len = n.nextInt();
		System.out.println("Your list of integers");
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i < len;i++){
			String temp;
			int t = 0;
			temp = s.next();
			t = Integer.parseInt(temp);
			list.add(t);
	//		System.out.println("FOREVER");
		}
		mill = System.currentTimeMillis();

		System.out.println("WORKING........");
		Collections.sort(list);
		fin = System.currentTimeMillis() - mill;
		for(int i = 0;i < list.size();i++){
			System.out.println(" ");
			System.out.print(list.get(i) + " ");
		}
		System.out.println(" ");
		System.out.println("This took " + fin + "ms");
	}
	static void placeSort(){
		long mill;
		long fin;
		System.out.println("Number of Integers");
		int len = 0;
		Scanner n = new Scanner(System.in);
		len = n.nextInt();
		System.out.println("Your list of integers");
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
	//	ArrayList<Integer> list2 = new ArrayList<Integer>();
	//	list1 = list;
		for(int i =0; i < len;i++){
			String temp;
			int t = 0;
			temp = s.next();
			t = Integer.parseInt(temp);
			list.add(t);
			System.out.println(t);
		}
		mill = System.currentTimeMillis();
	//	list1 = list;
		System.out.println("WORKING........");
		for(int i = 0;i < len;i++){
			int lowest = Integer.MAX_VALUE;
			int lowestj = Integer.MAX_VALUE;
			for(int j = 0;j < list.size();j++){
				if(list.get(j) != null){
					if(list.get(j) < lowest){
					//	System.out.println(list.get(j));
						lowest = list.get(j);
						lowestj = j;
					}	
				}
			}
			list1.add(lowest);
		//	list.set(lowestj, null);
			list.remove(lowestj);
	//		System.out.println(lowest);

		}
	
		
		fin = System.currentTimeMillis() - mill;
		for(int i = 0;i < list1.size();i++){
			System.out.println(" ");
			System.out.print(list1.get(i) + " ");
		}
		System.out.println(" ");
		System.out.println("This took " + fin + "ms");
	}


	//Base X to Base 10
	static void oneToTen(){
		String input;
		System.out.println("This is tally so type 1's");
		Scanner a = new Scanner(System.in);
		input = a.next();
		System.out.println(input.length());
	}
	static void tenToOne(){
		int input;
		System.out.println("Input a Base 10 number");
		Scanner a = new Scanner(System.in);
		input = a.nextInt();
		for(int i = 0;i < input;i++){
			System.out.print(1);
		}
	}
	static void twoToTen(){
		String input;
		int fin = 0;
		System.out.println("Input a binary number");
		Scanner a = new Scanner(System.in);
		input = a.next();
		input = new StringBuilder(input).reverse().toString();
		for(int i = 0; i < input.length();i++){
			if(input.charAt(i) == '1'){
				fin += Math.pow(2, i);
			}
		}
		System.out.println(fin);
	}
	static void tenToTwo(){
		String input;
		String fin = "";
		int curr = 0;
		System.out.println("Input a decimal number");
		Scanner a = new Scanner(System.in);
		input = a.next();
		curr = Integer.parseInt(input);
		int hbit = 0;
		int j = 0;
		while(true){
			if(curr >= Math.pow(2, j)){
				j++;
			}
			else{
				hbit = j-1;
				break;
			}
		}
		//System.out.println(j);
		for(int i = j-1;i >= 0;i--){
			if(curr - Math.pow(2, i) >= 0){
				curr -= Math.pow(2, i);
				fin += "1";
			}
			else{
				fin += "0";
			}
		}

		System.out.println(fin);
	}
	static void eightToTen(){
		String input;
		int fin = 0;
		System.out.println("Type an Octal");
		Scanner a = new Scanner(System.in);
		input = a.next();
		input = new StringBuilder(input).reverse().toString();

		for(int i = 0;i < input.length();i++){
			int temp = Character.getNumericValue(input.charAt(i));
			fin += temp * Math.pow(8, i);
		}
		System.out.println(fin);
	}
	static void tenToEight(){
		int input;
		int fin = 0;
		System.out.println("Type a Decimal");
		Scanner a = new Scanner(System.in);
		input = a.nextInt();
		System.out.println(Integer.toString(input,8));
	}
	
	
	//Custom Non-Executable Functions
	static int getFriendIndex(int[] tags,int tag){
		for(int i =0;i < tags.length;i++){
			if(tags[i] == tag){
				return i;
			}
		}
		return 0;
	}
	static int getCharInt(char a){
		if(a != ' '){
			return Character.getNumericValue(a) - Character.getNumericValue('A');
		}
		else{
			return 26;
		}
	}
	
	
	//Eulers Stuff	
	static boolean palindromeNum(int input) {
		LinkedList<Integer> stack = getDigits(input);
		for(int i = 0;i < stack.size()/2;i++) {
			if(stack.get(i) != stack.get(stack.size() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	static LinkedList<Integer> getDigits(int input) {
		int number = input;
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (number > 0) {
		    stack.push( number % 10 );
		    number = number / 10;
		}

		while (!stack.isEmpty()) {
			return stack;
		}
		return null;
	}
	static LinkedList<Long> getDigits(long input) {
		long number = input;
		LinkedList<Long> stack = new LinkedList<Long>();
		while (number > 0) {
		    stack.push( number % 10 );
		    number = number / 10;
		}

		while (!stack.isEmpty()) {
			return stack;
		}
		return null;
	}
	static LinkedList<BigInteger> getDigits(BigInteger input) {
		BigInteger number = input;
		LinkedList<BigInteger> stack = new LinkedList<BigInteger>();
		while (number.compareTo(BigInteger.ZERO) > 0) {
		    stack.push(number.mod(BigInteger.TEN));
		    number = number.divide(BigInteger.TEN);
		}

		while (!stack.isEmpty()) {
			return stack;
		}
		return null;
	}

	static boolean isPrime(int input) {
		for(int i = 2;i <= Math.sqrt((double)input);i++) {
			if(input % i == 0 && i != 1 && i != input) {
				return false;
			}
		}
		return true;
		
	}
}