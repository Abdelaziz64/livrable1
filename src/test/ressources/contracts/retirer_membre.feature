Feature: Retirer un membre d'une équipe

  Scenario: Retirer un membre d'une équipe existante
    Given l'utilisateur est authentifié
    And une équipe nommée "Les Étoiles" avec le membre "Jean Dupont" existe
    When il retire le membre "Jean Dupont" de l'équipe
    Then le membre "Jean Dupont" est retiré avec succès de l'équipe "Les Étoiles"

