import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class CrossoverBattleGame {
    private ArrayList<Character> characters;
    private int player1Wins = 0;
    private int player2Wins = 0;
    private Random random;

    public CrossoverBattleGame() {
        characters = new ArrayList<>();
        random = new Random();
        loadCharacters();
    }

    // Load characters with their abilities
    private void loadCharacters() {
        // JJBA main characters
        characters.add(new Character("Giorno Giovanna", "JJBA", "Gold Experience Requiem nullifies actions, resetting all harmful attempts to 'zero.'"));
        characters.add(new Character("Enrico Pucci", "JJBA", "Made in Heaven accelerates time, resetting the universe."));
        characters.add(new Character("Funny Valentine", "JJBA", "D4C Love Train redirects any harm through a dimensional barrier, protecting Valentine."));
        characters.add(new Character("Jotaro Kujo", "JJBA", "Star Platinum: The World has immense speed, power, and the ability to stop time briefly."));
        characters.add(new Character("Johnny Joestar", "JJBA", "Tusk Act 4 uses infinite rotation, dealing continuous damage that bypasses dimensions."));
        characters.add(new Character("Yoshikage Kira", "JJBA", "Killer Queen: Bites the Dust creates time loops that eliminate anyone who discovers Kira’s identity."));
        characters.add(new Character("Diavolo", "JJBA", "King Crimson erases time and predicts future actions, making Diavolo hard to hit."));
        characters.add(new Character("Weather Report", "JJBA", "Heavy Weather controls the weather to create illusions or cause dangerous atmospheric effects."));
        characters.add(new Character("Kars", "JJBA", "As the Ultimate Life Form, Kars can use any biological trait, making him nearly immortal."));
        characters.add(new Character("Josuke Higashikata", "JJBA", "Soft & Wet: Go Beyond creates bubbles that bypass dimensions, ignoring defenses."));

        // JJBA minor characters
        characters.add(new Character("Ringo Roadagain", "JJBA", "Mandom allows him to rewind time by six seconds, retrying situations to his advantage."));
        characters.add(new Character("Risotto Nero", "JJBA", "Metallica allows him to manipulate iron in blood, making him invisible or creating deadly weapons."));
        characters.add(new Character("N'Doul", "JJBA", "Geb is a water-based Stand that N'Doul controls remotely with his acute hearing."));
        characters.add(new Character("Prosciutto", "JJBA", "The Grateful Dead ages anyone nearby, with devastating effects on opponents."));
        characters.add(new Character("Oyecomova", "JJBA", "Boku no Rhythm wo Kiitekure creates time-delayed explosives, making any surface a potential bomb."));
        characters.add(new Character("Mikitaka Hazekura", "JJBA", "Earth Wind and Fire allows him to shape-shift into any object, useful for evasion and disguise."));
        characters.add(new Character("Axl RO", "JJBA", "Civil War forces opponents to face traumatic memories as physical entities."));
        characters.add(new Character("Blackmore", "JJBA", "Catch the Rainbow controls rain to create razor-sharp attacks or walk on raindrops."));
        characters.add(new Character("Tamaki Damo", "JJBA", "Vitamin C makes anything he touches malleable, including people, which can immobilize them."));
        characters.add(new Character("Dolomite", "JJBA", "Blue Hawaii can turn people into puppets by marking them, creating a zombie-like effect."));

        // Bleach main characters
        characters.add(new Character("Ichigo Kurosaki", "Bleach", "Possesses powers from Shinigami, Quincy, and Hollow heritage, with powerful Bankai and Getsuga Tensho."));
        characters.add(new Character("Yhwach", "Bleach", "The Almighty lets him see and alter all possible futures, with Quincy and Soul King powers."));
        characters.add(new Character("Sosuke Aizen", "Bleach", "Kyoka Suigetsu creates perfect hypnosis, making Aizen nearly impossible to detect."));
        characters.add(new Character("Genryusai Shigekuni Yamamoto", "Bleach", "Zanka no Tachi generates heat as intense as the sun, incinerating everything around."));
        characters.add(new Character("Kenpachi Zaraki", "Bleach", "With Nozarashi and his unnamed Bankai, Kenpachi has immense strength and near-uncontrollable power."));
        characters.add(new Character("Ichibe Hyosube", "Bleach", "Can manipulate the names and essence of objects, affecting reality itself."));
        characters.add(new Character("Jugram Haschwalth", "Bleach", "The Balance redistributes fortune and misfortune, creating equilibrium that favors him in battle."));
        characters.add(new Character("Uryu Ishida", "Bleach", "Antithesis reverses damage, allowing Uryu to transfer injuries to his opponent."));
        characters.add(new Character("Gerard Valkyrie", "Bleach", "The Miracle turns any damage into power, making him stronger as he takes hits."));
        characters.add(new Character("Shunsui Kyoraku", "Bleach", "Katen Kyokotsu: Karamatsu Shinju has multiple stages, creating deadly reality-bending games."));

        // Bleach minor characters
        characters.add(new Character("Coyote Starrk", "Bleach", "Primera Espada with immense Reiatsu and Cero Metralleta, allowing rapid-fire Cero blasts."));
        characters.add(new Character("Ulquiorra Cifer", "Bleach", "Segunda Etapa grants immense power, speed, and Lanza del Relámpago attacks."));
        characters.add(new Character("Shinji Hirako", "Bleach", "Sakanade reverses opponents’ senses, making his movements unpredictable."));
        characters.add(new Character("Baraggan Louisenbairn", "Bleach", "Respira ages and decays anything it touches, including people and attacks."));
        characters.add(new Character("Tessai Tsukabishi", "Bleach", "A master of Kido, with forbidden techniques that can trap or kill opponents instantly."));
        characters.add(new Character("Gremmy Thoumeaux", "Bleach", "The Visionary allows him to make his imagination a reality, creating endless scenarios."));
        characters.add(new Character("Retsu Unohana", "Bleach", "First Kenpachi with expert swordsmanship and healing abilities, making her resilient in battle."));
        characters.add(new Character("Lille Barro", "Bleach", "The X-Axis can pierce anything in a straight line, rendering him untouchable in battle."));
        characters.add(new Character("Mayuri Kurotsuchi", "Bleach", "Ashisogi Jizo paralyzes opponents, and his scientific knowledge makes him highly unpredictable."));
        characters.add(new Character("Nemu Kurotsuchi", "Bleach", "Artificially enhanced strength and durability, with a sacrificial move to destroy powerful foes."));

        // HxH main characters
        characters.add(new Character("Meruem", "HxH", "The Chimera Ant King with near-limitless strength, intelligence, and Nen mastery."));
        characters.add(new Character("Isaac Netero", "HxH", "100-Type Guanyin Bodhisattva grants extreme speed and strength, devastating in combat."));
        characters.add(new Character("Chrollo Lucilfer", "HxH", "Skill Hunter allows him to steal Nen abilities, making him highly versatile."));
        characters.add(new Character("Ging Freecss", "HxH", "Master Nen user known for his intelligence, adaptability, and powerful aura."));
        characters.add(new Character("Neferpitou", "HxH", "Royal Guard with Doctor Blythe and Terpsichora, providing healing and puppetry abilities."));
        characters.add(new Character("Zeno Zoldyck", "HxH", "Dragon Head and Dragon Dive make him a deadly assassin with experience and power."));
        characters.add(new Character("Menthuthuyoupi", "HxH", "Royal Guard with immense strength, resilience, and shape-shifting abilities."));
        characters.add(new Character("Hisoka Morow", "HxH", "Bungee Gum and Texture Surprise enable deception and versatile combat strategies."));
        characters.add(new Character("Killua Zoldyck", "HxH", "Godspeed grants superhuman speed and reflexes, enhancing his agility and attacks."));
        characters.add(new Character("Silva Zoldyck", "HxH", "Master assassin with great strength and Nen abilities, rivaling the strongest fighters."));

        // HxH minor characters
        characters.add(new Character("Phinks Magcub", "HxH", "Ripper Cyclotron delivers powerful wind-up punches with explosive strength."));
        characters.add(new Character("Uvogin", "HxH", "Big Bang Impact can destroy nearly anything with sheer physical power."));
        characters.add(new Character("Morel Mackernasey", "HxH", "Deep Purple creates smoke clones for combat, overwhelming enemies strategically."));
        characters.add(new Character("Shoot McMahon", "HxH", "Darkness detaches limbs for remote attacks, excellent in ranged combat."));
        characters.add(new Character("Knuckle Bine", "HxH", "A.P.R. places interest on aura, forcing opponents into Zetsu once aura is bankrupt."));
        characters.add(new Character("Pike", "HxH", "Sticky Bubble creates web-like structures that trap and immobilize opponents."));
        characters.add(new Character("Shaiapouf", "HxH", "Spiritual Message senses emotions, with shape-shifting and manipulation abilities."));
        characters.add(new Character("Ikalgo", "HxH", "Living Dead Dolls allow control of corpses, a strategic advantage in battle."));
        characters.add(new Character("Biscuit Krueger", "HxH", "Her true muscular form enhances strength and endurance in combat."));
        characters.add(new Character("Kalluto Zoldyck", "HxH", "Dance of the Serpent’s Bite uses paper as sharp projectiles with deadly precision."));

        // JJK main characters
        characters.add(new Character("Sukuna", "JJK", "The King of Curses, with immense cursed energy and the Malevolent Shrine Domain Expansion."));
        characters.add(new Character("Satoru Gojo", "JJK", "Possesses the Six Eyes and Limitless technique, allowing him to manipulate space and overwhelm opponents."));
        characters.add(new Character("Yuta Okkotsu", "JJK", "Special grade sorcerer with bound cursed spirit Rika, possessing immense power and versatility."));
        characters.add(new Character("Kenjaku", "JJK", "Ancient sorcerer who body-hops and manipulates curses, using Geto's body and Cursed Spirit Manipulation."));
        characters.add(new Character("Toji Fushiguro", "JJK", "Possesses Heavenly Restriction, granting superhuman physical abilities and exceptional skill with cursed tools."));
        characters.add(new Character("Mahito", "JJK", "Idle Transfiguration allows him to shape souls, making him unpredictable and deadly in combat."));
        characters.add(new Character("Megumi Fushiguro", "JJK", "Possesses the powerful Ten Shadows technique, with shikigami that hold immense destructive potential."));
        characters.add(new Character("Jogo", "JJK", "High-grade cursed spirit with powerful fire and lava attacks, and Coffin of the Iron Mountain Domain Expansion."));
        characters.add(new Character("Kokichi Muta (Mechamaru)", "JJK", "Mechamaru's ultimate form grants enhanced power and durability for intense long-range battles."));
        characters.add(new Character("Choso", "JJK", "Death Painting Womb with Blood Manipulation, allowing him to create high-pressure blood attacks."));

        // JJK minor characters
        characters.add(new Character("Nanami Kento", "JJK", "Ratio Technique creates weak points in his opponent's body, with Overtime increasing his power."));
        characters.add(new Character("Aoi Todo", "JJK", "Boogie Woogie allows him to switch places with others by clapping his hands, coupled with immense strength."));
        characters.add(new Character("Naobito Zenin", "JJK", "Projection Sorcery splits time into frames, giving him extreme speed and agility."));
        characters.add(new Character("Panda", "JJK", "Gorilla Mode enhances speed and strength; has multiple cores for form-switching in battle."));
        characters.add(new Character("Mai Zenin", "JJK", "Construction technique allows her to create cursed energy bullets, enhancing her combat effectiveness."));
        characters.add(new Character("Ino Takuma", "JJK", "Uses Shikigami Mask and Ritual Curse Manipulation to enhance his abilities in combat."));
        characters.add(new Character("Momo Nishimiya", "JJK", "Uses Tool Manipulation to control her broom, providing aerial combat and scouting abilities."));
        characters.add(new Character("Kasumi Miwa", "JJK", "Simple Domain creates a barrier that nullifies enemy techniques, combined with her katana skills."));
        characters.add(new Character("Kokun", "JJK", "Cursed spirit with immense physical strength and durability."));
        characters.add(new Character("Arata Nitta", "JJK", "Skilled healer using Reverse Cursed Technique to aid allies in battle."));

    }
    private Character getRandomCharacter() {
        int index = random.nextInt(characters.size());
        return characters.get(index);
    }
    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (player1Wins < 5 && player2Wins < 5) {  // Loop until a player wins 3 rounds
            System.out.println("Player 1, press Enter to receive your character...");
            scanner.nextLine();
            Character player1Character = getRandomCharacter();
            System.out.println("Player 1's Character:\n" + player1Character);

            System.out.println("\nPlayer 2, press Enter to receive your character...");
            scanner.nextLine();
            Character player2Character = getRandomCharacter();
            System.out.println("Player 2's Character:\n" + player2Character);

            System.out.println("\nDiscuss and decide who would win based on the characters' abilities!");
            System.out.println("Use your imagination and knowledge to create scenarios where your character could win or lose.");

            // Input the winner, including the tie option
            System.out.println("\nEnter the winner (1 for Player 1, 2 for Player 2, 0 for a tie):");
            int winner = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            recordWin(winner);
        }

        // Final result after the best-of-5 is complete
        if (player1Wins == 5) {
            System.out.println("Player 1 wins the best of 5 series!");
        } else if (player2Wins == 5) {
            System.out.println("Player 2 wins the best of 5 series!");
        }

        resetGame();  // Reset scores if you want to start a new series
        System.out.println("Rerun the game...");
    }


    private void recordWin(int player) {
        if (player == 1) {
            player1Wins++;
        } else if (player == 2) {
            player2Wins++;
        } else if (player == 0) {  // New condition for a tie
            System.out.println("This round is a tie and will not be counted.");
            return;  // Exit the method without incrementing scores
        }

        System.out.println("Current Score - Player 1: " + player1Wins + " wins, Player 2: " + player2Wins + " wins");

        // Check if a player has won the best of 5
        if (player1Wins == 5 || player2Wins == 5) {
            System.out.println((player1Wins == 5 ? "Player 1" : "Player 2") + " wins the best of 5 series!");
        }
    }

    private void resetGame() {
        player1Wins = 0;
        player2Wins = 0;
        System.out.println("Rerun to start a new best of 5 series! - Hope you enjoyed :)");
    }


}

