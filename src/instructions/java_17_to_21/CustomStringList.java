package instructions.java_17_to_21;

import java.util.AbstractList;
import java.util.List;

/**
 * @author Maksim Urusov
 * @see <a href="https://vk.com/video-221759623_456239072">
 * Инструкции. Миграция Java проекта с 17 на 21 jdk</a>
 */
public class CustomStringList extends AbstractList<String> implements List<String> {

// ✅ до Java 20: компилируется без проблем!
// ❌ c Java 21 ошибка компиляции из-за возвращаемого типа:
// error: getFirst() in StringList cannot
//   implement getFirst() in List
//     public Optional<String> getFirst() {
//                                 ^
//   return type Optional<String> is not
//   compatible with String

//    public Optional<String> getFirst() { // раскомментируй для проверки кода
//        return size() == 0
//                ? Optional.empty()
//                : Optional.of(get(0));
//    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}