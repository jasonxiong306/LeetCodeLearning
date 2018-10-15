import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "abc"，其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 无重复字符的最长子串是 "b"，其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "wke"，其长度为 3。
 *      请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args){
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("jbpnbwwd"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0 ){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        int length = 0;
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i ++){
            for (int j = i ; j<s.length();j++){
                Character c  = s.charAt(j);
                if (characters.contains(c)){
                    length = length > characters.size() ? length : characters.size() ;
                    characters.clear();
                    break;
                }else {
                    characters.add(c);
                }
            }

        }
        return length;
    }
}
