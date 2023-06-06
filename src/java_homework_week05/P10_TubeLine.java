package java_homework_week05;
/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.Scanner;
public class P10_TubeLine {
    public static void main(String[] args) {

        tubeStations();

    }

    public static void tubeStations() {

        char result;

        HashMap<String, String> zone1 = new HashMap<>();

        zone1.put("ALDGATE", "Metropolitan/Circle");
        zone1.put("ALDGATE EAST", "Hammersmith & City/District");
        zone1.put("ANGEL", "Northern");
        zone1.put("BAKER STREET", "Metropolitan/Bakerloo/Circle/Jubilee/Hammersmith & City");
        zone1.put("BANK", "Waterloo & City/ Northern/Central");
        zone1.put("BARBICAN", "Metropolitan/Circle/Hammersmith & City");
        zone1.put("BATTERSEA POWER STATION", "Northern");
        zone1.put("BAYSWATER", "District/Circle");
        zone1.put("BLACKFRIARS", "District/Circle");
        zone1.put("BOND STREET", "Central/Jubilee");
        zone1.put("BOROUGH", "Northern");
        zone1.put("CANNON STREET", "District/Circle");
        zone1.put("CHANCERY LANE", "Central");
        zone1.put("CHARING CROSS", "Bakerloo/Northern");
        zone1.put("COVENT GARDEN", "Piccadilly");
        zone1.put("EDGWARE ROAD", "Bakerloo/Hammersmith & City/District/Circle");
        zone1.put("EMBANKMENT", "District/Bakerloo/Northern/Circle");
        zone1.put("EUSTON", "Northern/Victoria");
        zone1.put("EUSTON SQUARE", "Metropolitan/Circle/Hammersmith & City");
        zone1.put("FARRINGDON", "Metropolitan/Circle/Hammersmith & City");
        zone1.put("GLOUCESTER ROAD", "District/Piccadilly/Circle");
        zone1.put("GOODGE STREET", "Northern");
        zone1.put("GREAT PORTLAND STREET", "Metropolitan/Circle/Hammersmith & City");
        zone1.put("GREEN PARK", "Piccadilly/Victoria/Jubilee");
        zone1.put("HIGH STREET KENSINGTON", "District/Circle");
        zone1.put("HOLBORN", "Central/Piccadilly");
        zone1.put("HYDE PARK CORNER", "Piccadilly");
        zone1.put("KENNINGTON", "Northern");
        zone1.put("KING'S CROSS ST PANCRAS", "Metropolitan/Northern/Piccadilly/Circle/Victoria/Hammersmith & City");
        zone1.put("KNIGHTSBRIDGE", "Piccadilly");
        zone1.put("LAMBETH NORTH", "Bakerloo");
        zone1.put("LANCASTER GATE", "Central");
        zone1.put("LEICESTER SQUARE", "Piccadilly/Northern");
        zone1.put("LIVERPOOL STREET", "Metropolitan/Central/Circle/Hammersmith & City");
        zone1.put("LONDON BRIDGE", "Northern/Jubilee");
        zone1.put("MANSION HOUSE", "District/Circle");
        zone1.put("MARBLE ARCH", "Central");
        zone1.put("MARYLEBONE", "Bakerloo");
        zone1.put("MONUMENT", "District/Circle");
        zone1.put("MOORGATE", "Metropolitan/Northern/Circle/Hammersmith & City");
        zone1.put("NINE ELMS", "Northern");
        zone1.put("OLD STREET", "Northern");
        zone1.put("OXFORD CIRCUS", "Central/Bakerloo/Victoria");
        zone1.put("PADDINGTON", "District/Circle/Bakerloo/Hammersmith & City");
        zone1.put("PICCADILLY CIRCUS", "Bakerloo/Piccadilly");
        zone1.put("PIMLICO", "Victoria");
        zone1.put("QUEENSWAY", "Central");
        zone1.put("REGENT'S PARK", "Bakerloo");
        zone1.put("RUSSELL SQUARE", "Piccadilly");
        zone1.put("ST JAMES'S PARK", "District/Circle");
        zone1.put("ST PAUL'S", "Central");
        zone1.put("SLOANE SQUARE", "District/Circle");
        zone1.put("SOUTH KENSINGTON", "District/Piccadilly/Circle");
        zone1.put("SOUTHWARK", "Jubilee");
        zone1.put("TEMPLE", "District/Circle");
        zone1.put("TOTTENHAM COURT ROAD", "Central/Northern");
        zone1.put("TOWER HILL", "District/Circle");
        zone1.put("VICTORIA", "District/Circle/Victoria");
        zone1.put("WARREN STREET", "Northern/Victoria");
        zone1.put("WATERLOO", "Waterloo & City/Bakerloo/Northern/Jubilee");
        zone1.put("WESTMINSTER", "District/Circle/Jubilee");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter station name from zone 1:");
        String stationName = scanner.nextLine();
        stationName = stationName.toUpperCase();

        for (String i : zone1.keySet()) {
            if (stationName.equals(i)) {
                System.out.println("Tube lines passes are : " + zone1.get(i));
            }
        }
        System.out.println("This station is not in zone 1. ");

        scanner.close();


    }


}
