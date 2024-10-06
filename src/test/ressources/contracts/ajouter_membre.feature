Feature: Ajouter un membre à une équipe

  Scenario: Ajouter un nouveau membre à une équipe
    Given l'utilisateur est authentifié
    And une équipe nommée "Les Étoiles" existe
    When il ajoute le membre "Jean Dupont" à l'équipe
    Then le membre "Jean Dupont" est ajouté avec succès à l'équipe "Les Étoiles"

