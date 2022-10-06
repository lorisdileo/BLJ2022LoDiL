#include <stdio.h>
#include <stdlib.h>
#ifdef __unix__
    #define clrscr() printf("\x1B[2J")
#elif __BORLANDC__ && __MSDOS__
    #include <conio.h>
#elif __WIN32__ || _MSC_VER
    #define clrscr() system("cls")
#else
    #define clrscr() printf("clrscr() - Fehler!!\n")
#endif

#define X 'X'
#define O 'O'
#define LEER ' '
#define GAME_OVER 0
#define A_WINNER 1
#define CONTINUE 2

/* Inhalt des 3 x 3 großen Felds */
char TicTacToe[3][3] = { {' ',' ',' '},
                         {' ',' ',' '},
                         {' ',' ',' '} };
/* Spieler1 hat das Zeichen 'X'. */
char Spieler1 = O;
/* Spieler2 hat das Zeichen 'O'. */
char Spieler2 = X;
/* Anzahl der Felder, die besetzt werden können */
unsigned int felder = 9;

/* Funktionsprototypen */
void print_spielfeld(void);
char neuer_zug(char);
int if_win(void);

/* Gibt den aktuellen Zustand des Spielfelds aus. */
void print_spielfeld(void) {
   int i;

   clrscr();
   printf("       1   2   3  \n     +---+---+---+\n");
   for(i = 0; i < 3; i++) {
      printf("  %d  | ",i+1);
      printf("%c",TicTacToe[i][0]);
      printf(" | ");
      printf("%c",TicTacToe[i][1]);
      printf(" | ");
      printf("%c",TicTacToe[i][2]);
      printf(" | \n");
      if(i != 2) {
         printf("     +---+---+---+\n");
      }
      else {
         printf("     +---+---+---+\n");
      }
   }
}
/* Führt einen neuen Zug aus.
 * char ch: Zeichen des Spielers, der an der Reihe ist, 'X'
 * oder 'O'
 * Rückgabewert: Zeichen des Spielers, der eben an der Reihe war.
 * Falls ein Feld besetzt ist, wird der Rückgabewert vertauscht,
 * damit der aktuelle Spieler nochmals seinen Zug machen kann.
 * Hat ein Spieler gewonnen, gibt die Funktion die
 * symbolische Konstante GAME_OVER zurück.
 */
char neuer_zug(char ch) {
   unsigned int row, colum;

   printf("\nSpieler \"%c\" ist an der Reihe\n\n",ch);
   printf("Zeile  (1-3): ");
   scanf("%u",&row);
   printf("Spalte (1-3): ");
   scanf("%u",&colum);

   if(TicTacToe[row-1][colum-1] == LEER) {
      /* Zeichen in das mehrdimensionale Array */
      TicTacToe[row-1][colum-1] = ch;
      print_spielfeld();
      /* Haben wir schon einen Gewinner? */
      if(if_win() == A_WINNER)
         return GAME_OVER;
   }
   else { /* Ein bereits besetztes Feld */
      print_spielfeld();
      printf("\n!!! Feld ist bereits gesetzt !!!\n");
      return (ch == X) ?O :X;
   }
   /* Sind bereits alle Felder besetzt? */
   if(--felder > 0)
      return ch;
   else {
      printf("\nAlle Felder sind besetzt - Unentschieden\n");
      return GAME_OVER;
   }
}

/* Auswertung aller Möglichkeiten, um einen Gewinner zu ermitteln.
 * Rückgabewert: symb. Konstante A_WINNER, falls ein Gewinner
 * ermittelt wurde, oder die symbolische Konstante CONTINUE zum
 * Weiterspielen
 */
int if_win(void) {
  /* Zuerst Spieler1 'O' */
  if(TicTacToe[0][0] == Spieler1 &&
     TicTacToe[0][1] == Spieler1 &&
     TicTacToe[0][2] == Spieler1 ||
     TicTacToe[1][0] == Spieler1 &&
     TicTacToe[1][1] == Spieler1 &&
     TicTacToe[1][2] == Spieler1 ||
     TicTacToe[2][0] == Spieler1 &&
     TicTacToe[2][1] == Spieler1 &&
     TicTacToe[2][2] == Spieler1 ||
     TicTacToe[0][0] == Spieler1 &&
     TicTacToe[1][0] == Spieler1 &&
     TicTacToe[2][0] == Spieler1 ||
     TicTacToe[0][1] == Spieler1 &&
     TicTacToe[1][1] == Spieler1 &&
     TicTacToe[2][1] == Spieler1 ||
     TicTacToe[0][2] == Spieler1 &&
     TicTacToe[1][2] == Spieler1 &&
     TicTacToe[2][2] == Spieler1 ||
     TicTacToe[0][0] == Spieler1 &&
     TicTacToe[1][1] == Spieler1 &&
     TicTacToe[2][2] == Spieler1 ||
     TicTacToe[0][2] == Spieler1 &&
     TicTacToe[1][1] == Spieler1 &&
     TicTacToe[2][0] == Spieler1) {
        printf("Spieler1 hat gewonnen\n");
        return A_WINNER;
  }

  /* Jetzt Spieler2 'X' */
  else if( TicTacToe[0][0] == Spieler2 &&
           TicTacToe[0][1] == Spieler2 &&
           TicTacToe[0][2] == Spieler2 ||
           TicTacToe[1][0] == Spieler2 &&
           TicTacToe[1][1] == Spieler2 &&
           TicTacToe[1][2] == Spieler2 ||
           TicTacToe[2][0] == Spieler2 &&
           TicTacToe[2][1] == Spieler2 &&
           TicTacToe[2][2] == Spieler2 ||
           TicTacToe[0][0] == Spieler2 &&
           TicTacToe[1][0] == Spieler2 &&
           TicTacToe[2][0] == Spieler2 ||
           TicTacToe[0][1] == Spieler2 &&
           TicTacToe[1][1] == Spieler2 &&
           TicTacToe[2][1] == Spieler2 ||
           TicTacToe[0][2] == Spieler2 &&
           TicTacToe[1][2] == Spieler2 &&
           TicTacToe[2][2] == Spieler2 ||
           TicTacToe[0][0] == Spieler2 &&
           TicTacToe[1][1] == Spieler2 &&
           TicTacToe[2][2] == Spieler2 ||
           TicTacToe[0][2] == Spieler2 &&
           TicTacToe[1][1] == Spieler2 &&
           TicTacToe[2][0] == Spieler2)  {
              printf("Spieler2 hat gewonnen\n");
              return A_WINNER;
   }
   return CONTINUE;
}

int main(void) {
   char check = X;

   /* Leeres Spielfeld ausgeben */
   print_spielfeld();

   do { /* War Spieler mit dem Zeichen 'X' gerade dran ... */
      /* ... dann ist jetzt Spieler mit dem Zeichen 'O' dran ...*/
      if(check==X) {
            check=neuer_zug(O);
      }
      else { /* ... ansonsten der Spieler mit dem Zeichen 'X'. */
        check=neuer_zug(X);
      }
   } while( check != GAME_OVER );
   system("pause");
   return EXIT_SUCCESS;
}