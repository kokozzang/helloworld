package programmers.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;


class Solution {
  public int[] solution(String[] genres, int[] plays) {
//    int[] answer = {};

    // ordering: N
    List<Music> musicList = new ArrayList<>();
    for (int i = 0; i < genres.length; i++) {
      Music music = new Music(i, genres[i], plays[i]);
      musicList.add(music);
    }

    // N
    Map<String, Integer> sumOfPlayByGenreMap = new HashMap<>();
    musicList.forEach(music -> {
      int sumOfPlay = sumOfPlayByGenreMap.getOrDefault(music.genre, 0);
      sumOfPlayByGenreMap.put(music.genre, sumOfPlay + music.play);
    });

    Set entrySet = sumOfPlayByGenreMap.entrySet();

    List<Entry> entryList = new ArrayList<>(entrySet);
    Comparator<Entry> comparator = new Comparator<Entry>() {
      @Override
      public int compare(Entry o1, Entry o2) {
        return (int)o2.getValue() - (int)o1.getValue();

      }
    };

    entryList.sort(comparator);

    List<String> orderedGenre = entryList.stream()
        .map(entry -> (String)entry.getKey())
        .collect(Collectors.toList());




    List<Integer> answerList = new ArrayList<>();

    Map<String, List<Music>> musicListByGenreMap = new HashMap<>();
    for (Music music: musicList) {
      List<Music> genreMusicList = musicListByGenreMap.getOrDefault(music.genre, new ArrayList<>());
      genreMusicList.add(music);
      genreMusicList.sort((m1, m2) -> m2.play - m1.play);
      musicListByGenreMap.put(music.genre, genreMusicList);
    }

    for (String genre: orderedGenre) {
      List<Music> genreMusicList = musicListByGenreMap.get(genre);
      for (int i = 0; i < 2 && i < genreMusicList.size(); i++) {
        answerList.add(genreMusicList.get(i).index);

      }
    }

    return answerList.stream().mapToInt(i -> i).toArray();
  }
}

class Music {
  int index;
  String genre;
  int play;

  public Music(int index, String genre, int play) {
    this.genre = genre;
    this.play = play;
    this.index = index;
  }

}

public class Album {

  public static void main(String[] args) {
    test();

  }

  private static void test() {
    String[] genres = {"classic", "pop", "classic", "classic", "pop", "citypop"};
    int[] plays = {500, 600, 150, 800, 2500, 100};

    Solution solution = new Solution();
    solution.solution(genres, plays);
  }

  private static void streamTest() {
    int[] integerArr = {1, 2, 3, 4, 5};
    List<Integer> integerList = Arrays.stream(integerArr).boxed().collect(Collectors.toList());

    integerList = integerList.stream().map(v -> {
      System.out.println(v);
      return v;
    }).collect(Collectors.toList());
    System.out.println(integerList);
  }


}

