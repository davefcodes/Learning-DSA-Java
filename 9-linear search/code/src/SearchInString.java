public class SearchInString {
    public static void main(String[] args){
        String name = "David";
        char target = 'v';
        System.out.println(search(name, target));
        System.out.println(getCharacterIndex(name, target));
        System.out.println(searchLetter(name, target));
    }

    public static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++ ){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // search the string and return the index of a character
    public static int getCharacterIndex(String str, char target){
        if (str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    public static boolean searchLetter(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char letter : str.toCharArray()){
            if (letter == target){
                return true;
            }
        }
        return false;
    }


}
