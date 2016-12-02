package hu.bme.aut;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kkrisz
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
class Solution {
    private List<String> parts;
    private Boolean successful;
    private Integer depth;
    
    public String toDisplayString() {
        String solRes = successful.toString();
        solRes += parts.stream().collect(Collectors.joining("; "));
        solRes += "it was " + depth + " deep";
        return solRes;
    }
    
    public static Solution copy(Solution s, int limit) {
        Solution newsol = new Solution();
        newsol.setDepth(s.getDepth());
        newsol.setSuccessful(s.getSuccessful());
        newsol.setParts(s.getParts().subList(0, limit));
        return newsol;
    }
} 
