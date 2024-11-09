public class Character {
        String name;
        String series;
        String description;

        public Character(String name, String series, String description) {
            this.name = name;
            this.series = series;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Character: " + name + "\n" +
                    "Series: " + series + "\n" +
                    "Abilities: " + description;
        }
    }

