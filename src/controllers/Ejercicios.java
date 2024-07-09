package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Ejercicios {

    /**
     * Determina si dos cadenas de caracteres son anagramas.
     * Dos cadenas son anagramas si tienen los mismos caracteres en la misma
     * cantidad,
     * sin importar el orden.
     *
     * Ejemplo 1:
     * Input: str1 = "listen", str2 = "silent"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     *
     * Ejemplo 2:
     * Input: str1 = "hello", str2 = "bello"
     * Output: false
     * Explicación: Las cadenas tienen diferentes caracteres.
     *
     * Ejemplo 3:
     * Input: str1 = "triangle", str2 = "integral"
     * Output: true
     * Explicación: Ambas cadenas tienen los mismos caracteres con la misma
     * frecuencia.
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        if (str1.equalsIgnoreCase(str2))
            return true;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        char[] chars = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
            if (map2.containsKey(chars2[i])) {
                map2.put(chars2[i], map2.get(chars2[i]) + 1);
            } else {
                map2.put(chars2[i], 1);
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) != map2.get(c)) {
                return false;
            }
        }
        return true;

    }

    /*
     * Dado un array de números enteros y un objetivo, retorna los índices de dos
     * números para los que la suma de ambos sea igual al objetivo.
     *
     * Se asume que hay una sola solución
     *
     * Ejemplo A:
     * Input: nums = [9,2,3,6], objetivo = 5
     * Output: [1,2]
     * Explicación: nums[1] + nums[2] == 5, devolvemos [1, 2].
     *
     * Ejemplo B:
     * Input: nums = [9,2,3,6], objetivo = 10
     * Output: null
     */
    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i + 1] == objetivo) {
                map.put(i, nums[i]);
                map.put(i + 1, nums[i + 1]);
                return map.keySet().stream()
                        .mapToInt(Integer::valueOf)
                        .toArray();
            }

        }
        return null;

    }
}
