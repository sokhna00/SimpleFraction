# Compléments de programmation - TD 1
Nom, Prénom, No Etudiant, Nc
     > DIOP Sokhna Diarra , 22305937 , 25
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp)).
À chaque étape, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`).

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > Lorsque l'on crée un dépôt sur une forge comme GitHub et qu'on coche la case "Initialize this repository with", cela signifie que noud voulons initialiser le dépôt avec un contenu initial. En général, cela inclut un fichier README.md, une licence par défaut (comme MIT ou Apache), et parfois un fichier .gitignore pour exclure certains types de fichiers du suivi git.

Si on ne coche aucune des cases "Initialize this repository with", le dépôt sera créé vide, sans aucun contenu initial. On devra ensuite ajouter manuellement les fichiers que nous souhaitons suivre avec git et effectuer un premier commit pour commencer à enregistrer l'historique des modifications.

La principale différence réside dans le fait que, lorsqu'on coche la case "Initialize this repository with", le dépôt est préparé avec un contenu initial, ce qui peut être utile si on a déjà un projet en cours.Par contre, si on ne coche aucune case, on part d'une base vide et on doit ajouter les fichiers et dossiers un par un.

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`) (cf. [Personnalisation de Git](https://git-scm.com/book/fr/v2/Personnalisation-de-Git-Configuration-de-Git));
    ```bash
      git config --global user.name "Sokhna Diarra"
      git config --global user.email dsokhnadiarra@ept.sn
    ```
1. Initialisez le dépôt `git` local pour le projet (cf. [Démarrer un dépôt Git](https://git-scm.com/book/fr/v2/Les-bases-de-Git-D%C3%A9marrer-un-d%C3%A9p%C3%B4t-Git));
    ```bash
       git init
    ```
1. Dans votre IDE, créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet (cf. [Méthode `main`](https://docs.oracle.com/javase/specs/jls/se19/html/jls-12.html#jls-12.1.4));
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements (cf. [Enregistrer des modifications dans le dépôt](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Enregistrer-des-modifications-dans-le-d%C3%A9p%C3%B4t));
    ```bash
      git status
      git add .
      git commit -m "Creation de la classe Fraction et main"
      git push
    ```
1. Ajoutez la méthode `toString` à la classe `Fraction` (cf. [`Object.toString`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#toString())) qui retournera la chaîne `"Je suis une fraction."` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    // javac Fraction.java Main.java

    ```
1. Publiez vos modifications sur le dépôt distant (cf. [Travailler avec des dépôts distants](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Travailler-avec-des-d%C3%A9p%C3%B4ts-distants));
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    git remote add origin https://github.com/ensYeh/compl-prog-td1-sokhna00.git #already exists
    git add .
    git commit -m "Adding my changes"
    git push
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Pour le fichier de documentation README.md, la syntaxe la plus couramment utilisée est la syntaxe Markdown. Markdown est un langage de balisage léger qui permet de formater du texte de manière simple et lisible.
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
     git pull origin master

    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (cf. [`.gitignore` pour Java](https://github.com/github/gitignore/blob/main/Java.gitignore));
    ```bash
    # # Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*
replay_pid*
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
      git rm --cached -r .idea/
      git rm --cached *.iml

    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Répertoire de configuration principal d'IntelliJ IDEA
   .idea/
   *.iml
    ```
   1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    >    - Générer une paire de clés SSH (clé publique et clé privée) sur  l'ordinateur si ça n'existe pas deja. On peut utiliser la commande suivante dans le terminal pour générer une paire de clés : ssh-keygen -t ed25519 -C "dsokhnadiarra@ept.sn"

    >    - Ajoutez la clé SSH à l'agent SSH pour qu'il puisse la gérer :  eval "$(ssh-agent -s)"
           ssh-add ~/.ssh/id_ed25519

    >    - Copiez la clé publique (~/.ssh/id_ed25519.pub) au presse-papiers en utilisant la commande cat ou un éditeur de texte.

    >    -  Se connecter au compte GitHub. 

    >    - Accédez aux paramètres du compte en cliquant sur la photo de profil en haut à droite, puis en sélectionnant "Settings" (Paramètres).
    >    - Dans la colonne de gauche, on clique sur "SSH and GPG keys" (Clés SSH et GPG). 
    >    - New SSH key
    >    - Donner un nom a la clé
    >    - Ajouter la clé ssh


## Partie II (à faire durant le TD) : compléter la classe `Fraction`
Dans cet partie, vous compléterez les classes `Fraction` et `Main`.
Un exemple d'interface pour une telle classe est donné par la classe [`Fraction`](http://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](http://commons.apache.org/math/).

Vous respecterez les consignes ci-dessous :
* chaque méthode de `Fraction` sera testée dans `Main` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp));
* à la fin de chaque question, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`) puis validez les changements.

1. Ajoutez les attributs représentants le numérateur et le dénominateur (nombres entiers).
    ```Java
    //     private int numerateur;   // Numérateur
   //       private int denominateur; // Dénominateur
    ```
1. Ajoutez les constructeurs (cf. [Constructor Declarations](https://docs.oracle.com/javase/specs/jls/se19/html/jls-8.html#jls-8.8)) suivants :
    * initialisation avec un numérateur et un dénominateur,
    * initialisation avec juste le numérateur (dénominateur égal à _1_),
    * initialisation sans argument (numérateur égal _0_ et dénominateur égal à _1_),
    ```Java
    //  public String toString() {
        // return numerateur + "/" + denominateur;
     // }
    ```
1. Ajoutez les fractions constantes ZERO (0, 1) et UN (1, 1) (cf. [Constants in Java](https://www.baeldung.com/java-constants-good-practices)),
    ```Java
      // Fraction constante ZERO
    // public static final Fraction ZERO = new Fraction(0, 1);

    // Fraction constante UN
   //  public static final Fraction UN = new Fraction(1, 1);
    ```
1. Ajoutez une méthode de consultation du numérateur et du dénominateur (par convention, en Java, une méthode retournant la valeur de l'attribut `anAttribute` est nommée `getAnAttribute`),
    ```Java
       /* Méthode pour obtenir le numérateur
    public int getNumerateur() {
        return numerateur;
    }

    // Méthode pour obtenir le dénominateur
    public int getDenominateur() {
        return denominateur;
    } */
    ```
1. Ajoutez une méthode de consultation de la valeur sous la forme d'un nombre en virgule flottante (méthode `doubleValue()`) (cf. [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html)),
   ```Java
    // Assertions pour tester la conversion
    ```
1. Ajoutez une méthode permettant l'addition de deux fractions (la méthode `add` prend en paramètre *une* fraction et *retourne* la somme de la fraction courante et du paramètre),
   ```Java
    // Assertions pour tester l'addition
    ```
1. Ajoutez le test d'égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) (cf. [`java.lang.Object.equals`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object))),
   ```Java
    // Assertions pour tester l'égalité
    ```
1. Ajoutez la comparaison de fractions selon l'ordre naturel (cf. [`java.lang.Comparable`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Comparable.html)).
   ```Java
    // Assertions pour tester la comparaison
    ```
1. Faites hériter votre classe `Fraction` de la classe [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html) et complétez les méthodes
   ```Java
    // Vérifiez avec le code ci-dessous
    Number aNumber = java.math.BigDecimal.ONE;
    Number anotherNumber = new Fraction(1, 2);
    assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    ```

## Partie III (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > Répondre ici
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # Répondre ici
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # Répondre ici
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # Répondre ici
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # Répondre ici
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # Répondre ici
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # Répondre ici
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Répondre ici
    * `screen`/`tmux`
        > Répondre ici
    * `curl`/[HTTPie](https://httpie.org/)
        > Répondre ici
    * [jq](https://stedolan.github.io/jq/)
        > Répondre ici

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > Répondre ici

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Répondre ici
1. Comment choisir le JDK à utiliser dans un projet ?
    > Répondre ici
1. Comment préciser la version Java des sources dans un projet ?
    > Répondre ici
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Répondre ici
1. Comment reformater un fichier source Java ?
    > Répondre ici
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Répondre ici
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Répondre ici
1. Comment renommer une classe dans l'ensemble du projet ?
    > Répondre ici
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > Répondre ici
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Répondre ici
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Répondre ici
