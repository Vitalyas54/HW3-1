public class BonusMilesService {
    public int calculate(int cost) {
        int mileBonus = 1;
        int bonusMiles = (cost / 20) * mileBonus;
        return bonusMiles;
    }
}

