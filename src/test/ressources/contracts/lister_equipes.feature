Feature: Lister toutes les équipes

  Scenario: Afficher la liste de toutes les équipes
    Given l'utilisateur est authentifié
    When il consulte la liste des équipes
    Then toutes les équipes sont affichées avec succès

