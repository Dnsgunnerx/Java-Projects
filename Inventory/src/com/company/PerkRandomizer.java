package com.company;

import java.util.Random;

public class PerkRandomizer {

    Random rand = new Random();
    public static String[] perks = {"Ace in the Hole", "Adrenaline", "Aftercare", "Alert", "Any Means Necessary", "Autodidact", "Babysitter", "Balanced Landing", "Better Together", "Boil Over", "Bond", "Borrowed Time",
            "Botany Knowledge", "Breakdown", "Breakout", "Buckle Up", "Calm Spirit", "Camaraderie", "Dance With Me", "Dark Sense", "Dead Hard", "Decisive Strike", "Deliverance", "Detective's Hunch",
            "Distortion", "Diversion", "Déjà Vu", "Empathy", "Fixated", "Flip-Flop", "For the People", "Head On", "Hope", "Inner Strength", "Iron Will", "Kindred", "Leader", "Left Behind", "Lightweight",
            "Lithe", "Lucky Break", "Mettle of Man", "No Mither", "No One Left Behind", "Object of Obsession", "Off the Record", "Open-Handed", "Pharmacy", "Plunderer's Instinct", "Poised", "Premonition", "Prove Thyself",
            "Quick & Quiet", "Red Herring", "Resilience", "Saboteur", "Second Wind", "Self-Care", "Slippery Meat", "Small Game", "Sole Survivor", "Solidarity", "Spine Chill", "Sprint Burst", "Stake Out", "Streetwise, " +
            "This Is Not Happening", "Technician", "Tenacity", "Unbreakable", "Up the Ante", "Urban Evasion", "Vigil", "Wake Up!", "We'll Make It", "We're Gonna Live Forever", "Windows of Opportunity"};

    public static String[] kPerks = {"A Nurse's Calling", "Agitation", "Bamboozle", "Barbecue & Chilli", "Beast of Prey", "Bitter Murmur", "Blood Echo", "Blood Warden", "Bloodhound", "Brutal Strength",
            "Corrupt Intervention", "Coulrophobia", "Cruel Limits", "Dark Devotion", "Dead Man's Switch", "Deerstalker", "Discordance", "Distressing", "Dying Light", "Enduring", "Fire Up", "Franklin's Demise",
            "Furtive Chase", "Gearhead", "Hangman's Trick", "Hex: Devour Hope", "Hex: Haunted Ground", "Hex: Huntress Lullaby", "Hex: No One Escapes Death", "Hex: Retribution", "Hex: Ruin", "Hex: The Third Seal",
            "Hex: Thrill of the Hunt", "I'm All Ears", "Infectious Fright", "Insidious", "Iron Grasp", "Iron Maiden", "Knock Out", "Lightborn", "Mad Grit", "Make Your Choice", "Mindbreaker", "Monitor & Abuse",
            "Monstrous Shrine", "Nemesis", "Overcharge", "Overwhelming Presence", "Play with Your Food", "Pop Goes the Weasel", "Predator", "Rancor", "Remember Me", "Save the Best for Last", "Shadowborn", "Sloppy Butcher",
            "Spies from the Shadows", "Spirit Fury", "Stridor", "Surge", "Surveillance", "Territorial Imperative", "Thanatophobia", "Thrilling Tremors", "Tinkerer", "Unnerving Presence", "Unrelenting",
            "Whispers", "Zanshin Tactics"};



    public void generate() {

System.out.println("Survivor Perks");
        for (int i = 0; i < 4; i++)
        {
            int number = rand.nextInt(76);
            String perk = perks[number];

            if (number < 15) { System.out.println(perk + ": found on page 1"); }
            else if (number < 29) { System.out.println(perk + ": found on page 2"); }
            else if (number < 44) { System.out.println(perk + ": found on page 3"); }
            else if (number < 59) { System.out.println(perk + ": found on page 4"); }
            else if (number < 74) { System.out.println(perk + ": found on page 5"); }
            else { System.out.println(perk + ": found on page 6"); }
        }
        System.out.println(" ");
        System.out.println("killer Perks");
        for (int i = 0; i < 4; i++)
        {
            int number = rand.nextInt(68);
            String perk = kPerks[number];

            if (number < 15) { System.out.println(perk + ": found on page 1"); }
            else if (number < 29) { System.out.println(perk + ": found on page 2"); }
            else if (number < 44) { System.out.println(perk + ": found on page 3"); }
            else if (number < 59) { System.out.println(perk + ": found on page 4"); }
            else { System.out.println(perk + ": found on page 5"); }
        }
    }

        public static void main (String[]args) {
            PerkRandomizer perk = new PerkRandomizer();
            perk.generate();
        }
    }

