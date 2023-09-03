import java.util.ArrayList;

/**
 * Session3 Prompt:
 *
 * GitHub is an open source program that allows developers to collaborate
 * remotely, almost as if they were on the same machine. Well, in fact
 * "branches" are essentially what help maintain these workflows and keep code
 * centralized as if it's on just one machine.
 *
 * Branches consist of "pull requests", or code changes that get submitted by
 * specific developers. These pull requests are typically required to be
 * reviewed by a set of developers first before they can be merged into the
 * master branch, however even if they do get an adequate review, they can still
 * cause breakages (welcome to Google, lol).
 *
 * Given a "Branch" and "PullRequest" interface implementation below, I want you
 * to create a function that will allow us to keep our branches bug-free by
 * being able to identify which pull request (if any) broke the branch.
 */
public class pullReq {

    /**
     * A class [Branch] that resembles a GitHub branch.
     */
    private static class Branch {

        // An ArrayList of [PullRequest] objects.
        private ArrayList<PullRequest> pullRequests = new ArrayList<>();

        // Returns the entire [PullRequest] history for this specific [Branch].
        ArrayList<PullRequest> getAllPullRequests() {
            return pullRequests;
        }

        // Adds a new [PullRequest] to the history of pull-requests.
        void addPullRequest(PullRequest pullRequest) {
            pullRequests.add(pullRequest);
        }

        // Adds a batch of [PullRequest] to the history of pull-requests.
        void addPullRequestBatch(ArrayList<PullRequest> pullRequests) {
            this.pullRequests.addAll(pullRequests);
        }

        // Implement a function that could tell us exactly which [PullRequest]
        // broke the [Branch].
        // Add your code here:
        public PullRequest getPullRequest() {
            for (int i = 0; i < pullRequests.size(); i++){
                if (!pullRequests.get(i).affectedTestsPass){
                    return pullRequests.get(i);
                }
            }
            return null;
            // Iterate over all of the branch's pullRequests
            // If this pullRequest's affected tests did not pass
            // We know this pullRequest broke the branch
            // Else, we need to keep iterating to find the one that did (if any)
            // arr, pullRequests
            // if (pullRequests.get(i).affectedTestsPass) --> boolean

        }

        /*
         * A class [PullRequest] that resumles a GitHub pull-request.
         */
        private static class PullRequest {

            // Class attributes
            String requestId;
            String content;
            String author;
            boolean affectedTestsPass;

            // Constructor.
            public PullRequest(String requestId, String content, String author, boolean affectedTestsPass) {
                this.requestId = requestId;
                this.content = content;
                this.affectedTestsPass = affectedTestsPass;
            }

            // In theory, this would have some functions, but for the purpose
            // of the interview let's assume we don't need any.

        } // end Session3.Branch.PullRequest

    } // end Session3.Branch

} // end Session3