

        for (limitAttempts; limitAttempts > 0; limitAttempts--) {

            printf("> ");
            scanf("%d", &guessedNum);

            if (guessedNum == randomNum) {

                printf("YOU WON!\n");
                winner = true;