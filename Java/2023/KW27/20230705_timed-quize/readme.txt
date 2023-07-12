NYoS (Noser Young Operating System) ist eine Anwendung, die das Erscheinungsbild und die Grundfunktionen einer durchschnittlichen Eingabeaufforderung (CMD) nachahmt.
Ohne eine dernd angegebenen Klassen zu äern, kann es jedoch nur den zuvor eingegebenen Text ausgeben.

Kontrollen:
- UP-TASTE Laden Sie den zuvor übermittelten Inhalt in das Eingabefeld.
- ABWÄRTS-TASTE lädt den zuletzt übermittelten Inhalt in das Eingabefeld.
- ESC-TASTE löscht den Inhalt, der sich derzeit im Eingabefeld befindet.
- ENTER-TASTE Übermitteln Sie den im Eingabefeld eingegebenen Inhalt.

Wichtige Methoden von Console.java:
- stop() Beendet die Anwendung.
- append(String text) hängt im Ausgabefeld Text an vorhandenen Text an.
- appendLine(String text) wie oben, fügt jedoch immer ein \n am Ende hinzu.
- setText(String text) ersetzt den gesamten Text im Ausgabefeld durch anderen Text.
- getText() gibt den aktuell im Ausgabefeld befindlichen Text zurück.
- clear() Löscht das Ausgabefeld.

Idee:
- Bauen Sie auf dem Konsolen simulator auf, sodass vordefinierte Fragen gestellt werden.
- Auf jede Frage gibt es mehrere Antworten, von denen mindestens eine richtig ist.
- Zusätzlich verfügt jede Frage über einen Timer (denken Sie an Kahoot!).
- Durch Eingabe einer beliebigen Antwort wird im Quiz mit der nächsten Frage fortgefahren.
- Wenn Sie den Timer ablaufen lassen, wird das Quiz auch zur nächsten Frage weitergeleitet.
- Nach der letzten Frage werden die Ergebnisse des Quiz angezeigt (Welche Fragen wurden richtig beantwortet?)

Aber bevor wir überhaupt darüber nachdenken, wie Threads hier funktionieren:
- Wie modelliere ich ein Quiz?
- Ich schlage vor, zumindest ein Quiz.java- und eine Question.java-Klasse zu erstellen
- Besprechen Sie mit Ihren Kollegen, wie diese beiden Klassen zusammenarbeiten.
- Definieren Sie öffentliche Methoden, mit denen Sie das Quiz „nutzen“ können
- Vergleichbar mit den Methoden moveUp(), moveDown(), moveLeft(), moveRight() von Sokoban
- Wie integriere ich das Quiz in den Konsolen manager?
- Studieren Sie zuerst die 4 vorgegebenen Klassen.
- Es empfiehlt sich, mit einer Implementierung zu beginnen, der alle Timer-Funktionen fehlen.
- Wenn alles funktioniert, bringen Sie Threads (und damit den Frage-Timer) ins Spiel

Anmerkungen:
- Der Fragen-Timer kann ausgeblendet oder sichtbar sein.
- Nach der Quiz zusammenfassung wird das Programm entweder geschlossen oder das Quiz kann erneut beantwortet werden.