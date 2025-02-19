package tasks;

import common.Person;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Задача 3
Отсортировать коллекцию сначала по фамилии, по имени (при равной фамилии), и по дате создания (при равных фамилии и имени)
 */
public class Task3 {

  public static List<Person> sort(Collection<Person> persons) {
    return persons.stream()
      .sorted(Comparator.comparing(Person::getSecondName, Comparator.nullsFirst(Comparator.naturalOrder()))
        .thenComparing(Person::getFirstName)
        .thenComparing(Person::getCreatedAt))
      .collect(Collectors.toList());
  }
}
