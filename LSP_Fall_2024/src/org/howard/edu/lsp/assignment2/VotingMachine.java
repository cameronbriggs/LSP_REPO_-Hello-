package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {

    // A map to store candidates and their corresponding votes
    private Map<String, Integer> candidates;

    /**
     * Constructor that initializes the VotingMachine with an empty candidate list.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the voting machine.
     *
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Start with 0 votes
        } else {
            System.out.println("Candidate " + name + " already exists.");
        }
    }

    /**
     * Casts a vote for the specified candidate.
     *
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // Increment vote count
        } else {
            System.out.println("Candidate " + name + " does not exist.");
        }
    }

    /**
     * Returns a string representation of the candidates and their votes.
     *
     * @return a string listing each candidate and their vote count
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append("Candidate: ").append(entry.getKey())
                  .append(", Votes: ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}
