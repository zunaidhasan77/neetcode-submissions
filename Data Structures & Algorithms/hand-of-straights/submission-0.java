class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
                if(hand.length % groupSize !=0) return false;

        TreeMap<Integer, Integer> cardCountMap = new TreeMap<>();

        for(int card : hand) {
            cardCountMap.put(card, cardCountMap.getOrDefault(card,0)+1);
        }

        for (int card : cardCountMap.keySet()) {
            int count = cardCountMap.get(card);

            if (count>0) {
                for (int i=0; i<groupSize;i++){
                    int needed = card +i;
                    if(cardCountMap.getOrDefault(needed,0)<count ) {
                        return false;
                    }
                    cardCountMap.put(needed, cardCountMap.getOrDefault(needed,0) -count);
                }
            }
        }
        return true;
    }
}
