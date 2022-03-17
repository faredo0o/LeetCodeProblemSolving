package com.faredo0o;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
//["adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"]
//["adgj","adgk","adgl","adhj","adhk","adhl","adij","adik","adil","aegj","aegk","aegl","aehj","aehk","aehl","aeij","aeik","aeil","afgj","afgk","afgl","afhj","afhk","afhl","afij","afik","afil","bdgj","bdgk","bdgl","bdhj","bdhk","bdhl","bdij","bdik","bdil","begj","begk","begl","behj","behk","behl","beij","beik","beil","bfgj","bfgk","bfgl","bfhj","bfhk","bfhl","bfij","bfik","bfil","cdgj","cdgk","cdgl","cdhj","cdhk","cdhl","cdij","cdik","cdil","cegj","cegk","cegl","cehj","cehk","cehl","ceij","ceik","ceil","cfgj","cfgk","cfgl","cfhj","cfhk","cfhl","cfij","cfik","cfil"]
        String digits="234";
        System.out.println(letterCombination(digits));
    }
    public static List<String> letterCombination(String digits) {
        Map<Character, String> numList = new HashMap<>();
        numList.put('2', "abc");
        numList.put('3', "def");
        numList.put('4', "ghi");
        numList.put('5', "jkl");
        numList.put('6', "mno");
        numList.put('7', "pqrs");
        numList.put('8', "tuv");
        numList.put('9', "wxyz");
        List<String> result=new ArrayList<>();


        return result;
    }
}
