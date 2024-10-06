Feature: Créer une équipe

  Scenario: Créer une nouvelle équipe avec un nom valide
    Given l'utilisateur est authentifié
    When il saisit le nom de la nouvelle équipe "Les Étoiles"
    And il confirme l'ajout
    Then l'équipe "Les Étoiles" est ajoutée avec succès
