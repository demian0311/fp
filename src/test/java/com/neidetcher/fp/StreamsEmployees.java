package com.neidetcher.fp;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StreamsEmployees {

    List<Employee> employees = Arrays.asList(
            new Employee("Alice", LocalDate.of(1971, 12, 4), true, "Peoria"),
            new Employee("Bob", LocalDate.of(1983, 8, 12), false, "Lafayette"),
            new Employee("Charlie", LocalDate.of(1970, 11, 15), true, "Lafayette"),
            new Employee("Dan", LocalDate.of(1976, 7, 20), true, "Peoria"),
            new Employee("Eric", LocalDate.of(1980, 3, 12), false, "Broomfield"),
            new Employee("Fred", LocalDate.of(1988, 11, 2), true, "Broomfield"));

    @Test
    public void test() {
        Object foo = employees.stream()
                .filter(e -> e.getBirthDate().isBefore(LocalDate.of(1980, 1, 1)))
                .filter(e -> e.getCity().equals("Peoria"))
                .sorted();
        System.out.println("foo: " + foo);
    }

    public class Employee {
        private String name;
        private LocalDate birthDate;
        private Boolean fullTime;
        private String city;

        public Employee(
                final String nameIn,
                final LocalDate birthDateIn,
                final Boolean fullTimeIn,
                final String cityIn) {
            name = nameIn;
            birthDate = birthDateIn;
            fullTime = fullTimeIn;
            city = cityIn;
        }

        public String getName() {
            return name;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public Boolean getFullTime() {
            return fullTime;
        }

        public String getCity() {
            return city;
        }
    }
}
