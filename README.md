## Step 1: description of the branch structure at the start of the project
- dev: Integrate features.
- featurel: Add play-again loop functionality, ability to quit game with negative number input, and
            improve user feedback messages for guesses.
- feature2: Implement max attempts logic and game over condition.
- feature3: Add hint.
- hotfix: Fix randomInt to properly include max value in range.
- main: Stable production.

## Step 8: Review dev branch history
- Differences between merge, rebase, squash, and cherry-pick:
    - merge: combines two branches while keeping the current branch as is, so if there is
            is anything new/different in the branch being merged, it is added to the 
            current branch.
    - rebase: avoids unnecessary merge commits and history stays linear.
    - squash: reduces clutter and history stays linear because we can show latest 
            commit with chosen commit message (pick or squash).
    - cherry-pick: applies single commit to main without interacting with dev.
- What I observed in the git history for feature1 vs feature2 vs feature3:
    - feature1: history showed messages added to encourage users and quit feature. resolved merge conflict when merging dev into it. the branch was deleted (had to delete feature1 branch per the instructions).
    - feature2: implemented max attempts logic and game over condition, cleaned up the history (made it linear), and merged it into dev.
    - feature3: added maxAttempts constant and game over state, implemented max attempts logic and game over condition, resolved testing errors, and added hint system to show proximity after 3 attempts.

- When I would use each strategy in real projects
    - merge: when I need to preserve the original code, so I can add it to a branch I am 
            working on to build onto the latest main (pushed to origin, main. up and running) code.
    - rebase: when I need to keep the branch history clean and linear.
    - squash: when I need to clean up commit messages to increase readability and 
            keep history linear.
    - cherry-pick: integrate a single commit (change/update) to a different branch.