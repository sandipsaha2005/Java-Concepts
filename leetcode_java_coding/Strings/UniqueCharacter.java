public static int getFirstUniqueCharacter(String str){
        Queue<Character> q=new LinkedList<>();
        int arr[]=new int[26];
        for (int i = 0; i < str.length(); i++) {
            q.add(str.charAt(i));
            arr[str.charAt(i)-97]+=1;
        }
        int i=0;
        for(Character item : q){
            char ch=item;

            if(arr[ch-97]==1){
                return i;
            }
            i++;
        }
        return -1;
    }
