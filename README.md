J’ai commencé le projet par une étude du code d’Alex afin de comprendre sa stratégie et résoudre la problématique globale du projet heme_biotech.

Lire le fichier symptoms.txt ;
 
Calculer le nombre d’occurrences pour chaque symptôme ;
 
Retranscrire les résultats dans un fichier result.out.
 
En analysant la méthodologie d’Alex, j’ai pu déceler plusieurs points critiques qui l’ont empêché de réussir sa mission :

Le fichier symptoms.txt contient plus d'une vingtaine de symptômes alors qu’Alex a utilisé une variable par symptôme et s’est limité à trois pour faire les calculs : headacheCount, rashCount, pupilCount. Sa fonction ne prend donc pas en compte tous les symptômes qui existent dans son fichier symptoms.txt ;
 
Il a tenté d’incrémenter le nombre d’occurrences pour chaque symptôme dans une boucle While alors qu’il ne les a pas déclarés à l’intérieur de la fonction main ;
 
Il n’a pas géré les exceptions ;
 
Il a tenté d’aider le futur développeur qui voudra réutiliser son code par des commentaires, mais ceux-ci sont incompréhensibles et/ou peu utiles ;
 
La fonction main est très longue, ce qui implique un problème de performance pour son application. Par ailleurs, son code ne sera pas simple et lisible pour une équipe de développeurs qui souhaite reprendre son travail et ajouter de nouvelles fonctionnalités.
 
Afin de réaliser ce projet, j’ai repris le code d’Alex et corrigé sa fonction main. J’ai déclaré une variable de type List «items» et inséré les symptômes dans cette variable liste avec la boucle While et la fonction items.add(line). 

Avec la fonction HashMap du Java, j’ai tout d'abord regroupé la liste des symptômes dans une collection avec une paire Key-Value, de manière à regrouper le nombre de chaque symptôme répété en une valeur, et le nom du symptôme comme le Key. J’ai ensuite trié la collection des symptômes et leur nombre d’occurrences dans l’ordre alphabétique en utilisant la fonction HashMap. Enfin, je me suis servi de la fonction FileWriter d’Alex afin d’écrire les symptômes dans un fichier result.out comme cela était demandé dans l’exercice. À l’intérieur de cette fonction, j’ai utilisé une boucle For pour écrire la liste des symptômes sur plusieurs lignes avec le signe « = » en précisant le nombre d’occurrences pour chaque symptôme.

Vous trouverez la correction de la fonction d’Alex dans les deux class « AnalyticsCounter »  et « AnalyticsCounterTwo ».

Afin d’adapter mon code à la programmation orientée objet, j'ai utilisé l’interface ISymptomReader et la class ReadSymptomDataFromFile que Caroline a créée pour organiser mon code, et j’ai utilisé le JavaDoc pour aider l’équipe qui reprendra mon travail à comprendre toutes les fonctionnalités de mon projet.

Les fichiers ISymptomReader et ReadSymptomDataFromFile ont pour but de lire les fichiers de symptômes (dans notre cas, « symptoms.txt »). J’ai ajouté une notification en cas d’erreur, si la fonction fait un catch d’exception.

La « CalculateSymptom » s’occupe d’effectuer des calculs et de collecter les pairs clé-valeurs de la liste issue de la fonction GetSymptoms() qui se situe dans le fichier « ReadSymptomDataFromFile ».

La class « OutPutWriter » permet d’extraire les résultats dans un fichier results.out par ordre alphabétique.

Enfin, j’ai déclaré dans la class Main, toutes les fonctions en précisant le nom des deux variables, « filepath » et « outFilepath ».
