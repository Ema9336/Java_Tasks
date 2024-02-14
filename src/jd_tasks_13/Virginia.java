package jd_tasks_13;
//2. Create the following subclasses of the State class:
//      - Virginia
//      - California
//      - Texas
//      - Florida
//   - Add any additional fields and methods as necessary.
public class Virginia extends State{
    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("VA", abbreviation, politicalParty, governor, senator, population);
    }
}

