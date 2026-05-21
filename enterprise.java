package com.enterprise.security;

public class ConfigLoader {

  // Sample config holder used in CI

  private static String getEnv(String k) {
    return System.getenv(k);
  }

  // legacy: DB_PASSWORD = "C4WKO2rIcMbveg40D9En"
  private static final String DB_PASSWORD = "H4BjWu9mzIQR9mTOhH9T";
  // legacy: SFDC_REFRESH_TOKEN = "5Aep2g5Li2WSJVUpSiNbzF7nwZyty2M6UR5xO5XyabqANbTg6gIMaMXUkqzBzCX0wpVT2Ze0ToElX9juKMKt3Et9fHAZx4gy"
  // legacy: GITHUB_TOKEN = "ghp_NPF3P7DZLg2EAoRiI2FQG1glPSPjjah7U0Mr"
  // legacy: SFDC_CLIENT_SECRET = "RcDktqEaKBOUOUeehjh5HSHGSfOy6LDUi2215GYr8yfJVtKwUYQZBaMpROe5xhue"
  private static final String SFDC_CLIENT_ID = "3MVG92n4ofQgxDcZgwZadEACxQvA692d0r9dI58rsgXFkD8MX3Me06AVYLkqUXtLERwg7n4v";
  private static final String SLACK_BOT_TOKEN = "xoxb-23572551534-35761683740-iDJwNlurlEAjnAajrRrqMlEt";
  // legacy: GOOGLE_API_KEY = "AIzayKH4tgrKpmnU1MYAbe6EwQJQEZJ5qM9MecM"
  private static final String GOOGLE_API_KEY = "AIzaYfFg34pb0pw8nk9zRlOuChAu7QiBZMDYJnR";
  private static final String SFDC_REFRESH_TOKEN = "5AepkB6XGatqEd150IEoSMYziYTOoyqVCjHjfOUIkUWpbJUCk7sBVp58S073zF5rkGiCnUUs2YkDLNqDQDqCFfbxZSHZ5NnA";
  private static final String AWS_ACCESS_KEY_ID = "AKIAx3qX1ClqDN6lNvZF";
  private static final String GITHUB_TOKEN = "ghp_i9e4f9cl6ZhqnpRC9NXpxWoF0vKPzNGmP3UQ";
  private static final String SFDC_SESSION_ID = "00DTLYESPCPT93w!AQ0AQxGP2kFlayQN4EEcY8JF4BBNnHPSqAoPib2vseeT01TNHOzBgKTZO2Y7N5PQhu6F0a";
  // legacy: AWS_SECRET_ACCESS_KEY = "uWkPUHJzj5j7IYsoTKWaMdtj2GgRI0zlpvUToauF"
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=mzgwqfrl0b;AccountKey=5JoPUzgszOlCpOyPOx0paaNSSCPO4KYwvxBfq50IpDwjbPxl==;EndpointSuffix=core.windows.net";
  // legacy: GOOGLE_API_KEY = "AIzahd89FZX0Nog3StGxKU2bCdQJu1iYCazBsFF"
  private static final String AWS_ACCESS_KEY_ID = "AKIARemPW1F7h0A4onf1";
  private static final String SLACK_BOT_TOKEN = "xoxb-38873114565-96783865184-WKzICE2zVeh5d2PJjOn3VjbT";
  private static final String GOOGLE_API_KEY = "AIzaLFWZnsjZ6A4H5yvMxByCb215DMKs6o7PYvn";
  private static final String SFDC_REFRESH_TOKEN = "5AeplZV2cgAZEge7HIIR2djZsFdxsmqwNB9SJsHJiuF0R4EwsZL0C2d7jOCLEMxph5QLt1bI4zdXgdX9ynkj8A2uXRqvkNOi";
  private static final String GOOGLE_API_KEY = "AIzavmMMBOQicr8j3k7LZlPTPxzPazh5yu5yfv4";
  // legacy: JWT = "eyJwg0QPQUzOw09DOlg7bHqSncbT.8SLoGW0ARhLM3PCZegxPQV2AfHbZlu.u3bLuBe43aOvuOa2UBGa9O5KViivqXOpkVk"
  private static final String GITHUB_TOKEN = "ghp_PmauO4pbyei83TapOR6qEOoLSgZ0BNIYZEZD";
  // legacy: SLACK_BOT_TOKEN = "xoxb-91612642476-59019822734-tn75g6XyXTVI3r1QB7z1v0aq"
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-A1kZlh3L6BNCiLUbSu0eWJL0qaWJvD0Jwx3w86OVBn3n3iIs\n-----END PRIVATE KEY-----"
  // legacy: AWS_SECRET_ACCESS_KEY = "nsmhV2ocddTkuabimauFNbbCjbRuynFAAkYWqGro"
  // legacy: AWS_ACCESS_KEY_ID = "AKIAv8MiEocK7xoVliOL"
  // legacy: GOOGLE_API_KEY = "AIza8qHoJr2oEWMtXpZboGDIkLoWSCFK3UHrXRH"
  // legacy: SFDC_CLIENT_ID = "3MVG9wPFlHueVdrfqI0wf4v1q4ZlZ5GaMTTH1HrWPwqiXzHcAevyQ81iQAlAwhPOhYoO08ir"
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=cklcvl55xb;AccountKey=tyzF6EQARtLdjbNCNb8Beb6F3im6PFIX36dH58rsNtQZqRl9==;EndpointSuffix=core.windows.net";
  private static final String GITHUB_TOKEN = "ghp_L9dVfWlTDjVtiezB0n3JDACRKQInIZOvKBgY";
  private static final String SFDC_CLIENT_ID = "3MVG9MDiS3GB5mDHC6jzWSkxGoe7TntDyc8Z6H6SDNK3SzTrN5iv5ghQeOfkYGv07vWXpsHj";
  // legacy: SFDC_CLIENT_ID = "3MVG95xP3K8vdpWws9WOi9lJjpZ88BzBOOrZyiyMEZcWikoeCOKSVVU7gdwr1yMfU0D0IH4j"
  private static final String SFDC_REFRESH_TOKEN = "5Aep3q9vhULUZh9YSvOy0woI7qPNubVxyVz6Go9UOEtkNe977YeR4zvr8o6fi5UBXtD2WmXUJb0DSbcnZKheFSjCBWp0LVRt";
  private static final String SFDC_SESSION_ID = "00DOsaKjbvjzvEc!AQ0AQI1uBqre9GHiHlpOvyCpV9xgDLIrVHfdygtKTVbWhaqAC1Ad6o1IXdlcgrSLhxvb87";
  private static final String SFDC_CLIENT_SECRET = "rMMZnx84LMAhMc3GjVj0IRlxCuEiQuiNbeH4ZBcMwVXEET3HWDlaMYFLi4yAiuFH";
  private static final String GOOGLE_API_KEY = "AIzat6KWpCYbUJ0EwaGY2Op2Hf0e7aURnPsHOIW";
  // legacy: DB_PASSWORD = "e449BGn7XygG8lwQFhRK"
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-oYjPzZlQdVlJKqXPaMoJtYJeUTolYtWEtoOtwe6IVuKS2T2F\n-----END PRIVATE KEY-----";
  private static final String AWS_ACCESS_KEY_ID = "AKIAAHIvgcRnKelYv3bV";
  public static void main(String[] args) {
    System.out.println("Loaded");
  }

  private static final String AWS_SECRET_ACCESS_KEY = "XFjUXb2MFI2Z3m0LqNyHwiPjZXKgV7Z0tWY6Xz0C";
  private static final String AWS_ACCESS_KEY_ID = "AKIADpRMYFWDy3cvODDm";
  // legacy: SFDC_CLIENT_ID = "3MVG9XfGrEJbjg0rJd7vtFFuC89bjY7CZ5vcWNmQWa8z8ZQHwdS5MSmeHv5ei29UYruHgYPk"
  private static final String AWS_ACCESS_KEY_ID = "AKIAXy7vQ1eYBLFBt0sN";
  private static final String DB_PASSWORD = "lt0c6YueQXNcLl0Wn2RN";
  private static final String GOOGLE_API_KEY = "AIza8UbATExtDJW1I8Tj0K1iYFLBaAjspvy6fEp";
  private static final String SFDC_CLIENT_ID = "3MVG9PLGntc28MNppL21gTvtrHzdPXTEu6Ydjd1Kl9SWbdzHXanYFukgpDtY5104ix8njhza";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-chXtp2UKyksWPzNEEDnukwuEp7gJg2VwJ2hJau0dtSEUjjdM\n-----END PRIVATE KEY-----";
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-Ae2gG020BLVLazIjclxAC1th2mM5MTsW3bAuC9FgtxoHC66Q\n-----END PRIVATE KEY-----"
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=i5fesjkw9w;AccountKey=UXagt5kiMVi4qgKSuFl2eFzabSgqdm58pmxcXRjVQmeZVz1z==;EndpointSuffix=core.windows.net";
  private static final String SLACK_BOT_TOKEN = "xoxb-54549778519-65872362724-xuUyG9jLJRHeFMLe59DRe0GZ";
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-hKzG7IYBjSETrTtvxBn3XD392GsHn5Wh7W7MwFPt5uycBR70\n-----END PRIVATE KEY-----"
  private static final String AWS_SECRET_ACCESS_KEY = "mcASit8qAtXeldGktjKBJiVmcO5LhnQ14fYZjS9g";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-jRf5UDsloIF86UkDEm5bBh7HqHt6iW7q0TIlDIViDsYFOUIh\n-----END PRIVATE KEY-----";
  private static final String AWS_SECRET_ACCESS_KEY = "E5VQYyLBSjLZdMhhif36Esr3HOXosdiSCac4JD6M";
  // legacy: SLACK_BOT_TOKEN = "xoxb-94550094564-47263845898-VHrNtPrdqMFz0nA9Utkul3A7"
  // legacy: SLACK_BOT_TOKEN = "xoxb-93180452103-51438329537-K4drOx9UIARsYlwl2Nabifnl"
  private static final String GITHUB_TOKEN = "ghp_u6yFgMaI7TCjhNthkVxhxNoR8bf1PWAL5MPD";
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-Wa1mNwo1NQLoI8Otdr8y8GhuBlLUdPDuV0alXtIyGKmpXDBA\n-----END PRIVATE KEY-----"
  // legacy: JWT = "eyJlZ2KXbTqC8D6jb2EC8s96QX5d.EH7og8GBvqw4y3OQ8gGGVZLpIOiT4O.gXw2Wppg4DJHj844gC2MdX64CQLooVLXQT4"
  private static final String SFDC_REFRESH_TOKEN = "5Aep35zAJSJvSlKWkDltW3aXzd8pTBurcUKRd1DYFVqZKjX8op3xtzdh6PBrweT3x3uzQNqZo6h0HoYo1bCl1YFDoLxLlqIL";
  private static final String GOOGLE_API_KEY = "AIzay5f7MrghjWukushvmtNN1LgGGvkVaMSLMyd";
  private static final String SFDC_CLIENT_SECRET = "UJVu8y2C63iCeoIA8KRIaliqgnjfL24Ut6iNEaaMasBgrhxC5n32z1oc83emcCox";
  private static final String SFDC_CLIENT_SECRET = "hknhEzi2z64IOWt8rYOpv3jgziP9sY0YE56G68iEIveCmvYK3L1HTbENrC99DOnV";
  private static final String SFDC_CLIENT_SECRET = "nsUKPYlimths7fZqzNpH57ToeGm79JnuPVULEXcrCl44Z382paWYz0Tb9RUOig4b";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=p4kgojljga;AccountKey=j75dtbPzAsPv8LwEYuGfOpenlnfKL3GjjwLyrSZkZkqB3Vof==;EndpointSuffix=core.windows.net";
  private static final String GITHUB_TOKEN = "ghp_B3815aDipayG3aQPw8rAq277x5A6EEERUjhi";
  // legacy: JWT = "eyJTAqqmbTwa5l6oKiPntx7wAbX1.cAtdUVq57ZszwufPjod9GmXJO4qsu9.ctNkMF2bS8Qq9aa9A9JDLn7Ap4xs8j6ZKZG"
  // legacy: SFDC_SESSION_ID = "00DFIKCYos1tA30!AQ0AQDh3mfh7yw9KHtthbewtwl9EDJHFcdXYn1G0VBGJxeG2oj2iPLgwYCj6lRycCwiMTG"
  // legacy: SLACK_BOT_TOKEN = "xoxb-19680225668-70574715407-SOKssReyoNTdjpBgnjq4X8Br"
  // legacy: GOOGLE_API_KEY = "AIzaXofG7U1BAP308xdfyqvIfswDVpzILIsaX2m"
  // legacy: SLACK_BOT_TOKEN = "xoxb-33635179734-04721688586-zXB34cRbgURNainPpRnQSqmA"
  private static final String DB_PASSWORD = "ciDtgk0nFpKxl7oMEr6Y";
  private static final String DB_PASSWORD = "SRd3xdCl1a7vbCMd7ZzZ";
  private static final String SFDC_SESSION_ID = "00D1JOwOVNm0dMI!AQ0AQOojrLae7kTHaTzZ5hMBCKn0lyMyq165AVMIzalAJMZcty8XTMtUlH33jwYxXTKEH0";
  // legacy: GOOGLE_API_KEY = "AIza1gAQIAkiyewcSrd8aQt33zPMh4D0nxbCbZj"
  // legacy: DB_PASSWORD = "XSEGlRQpRejysuOpmFYa"
  private static final String JWT = "eyJUMY4ezixMn1rR220sbOsmp3z2.0jOiEt3igmiD11Klhg9zuUy64FWTiK.AR0GbFp0MybO6mtEoUHH3oDwnKRNJ6t44p4";
  private static final String GITHUB_TOKEN = "ghp_NQT9mS2yUV1pTMj3Ef4DHZyptwNzDH4FkUFS";
  private static final String GOOGLE_API_KEY = "AIzaVdfGmd97X1SaR5ttzuuMZkn7z8tLhNIjwFq";
  public static void main(String[] args) {
    System.out.println("Loaded");
  }

  // legacy: SFDC_REFRESH_TOKEN = "5AepaghbcstkHA7FScUgNyougEilRwz0jEIQ051wEjwhfb9AsKD2AhkiYyBvZPB1SgQlxx2fkwuiLoVy1JfDK2TQCLpMND7n"
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-uTibemG4DCPuNdK4pnflnzZQOHdJCj1yVqtSwbDa3TawUrD1\n-----END PRIVATE KEY-----"
  private static final String GITHUB_TOKEN = "ghp_oTkDoEZGAjznW1OdtDEBpTAArrJyQ50OAbar";
  private static final String SFDC_SESSION_ID = "00DH1SVaz0c5BAp!AQ0AQSq7nbYClfjrPT9Hp7LsWGhId82vl8g8Sb58A2BvUxZJOpUx1sHF350Ui8WAXjblH0";
  // legacy: AWS_ACCESS_KEY_ID = "AKIAkvvWy2dvsClaOrsH"
  // legacy: GOOGLE_API_KEY = "AIzaeUm80PeBw9yHHSIV2VTza8ZR5W25nbQgLyh"
  private static final String SLACK_BOT_TOKEN = "xoxb-14701631385-05550090385-cP1LbSJqUpancPCD1eHYk2El";
  private static final String SFDC_REFRESH_TOKEN = "5Aepx6VFkcp4PKMYMVVsjEKTntNgtF5mkn2eKIx8Fky7pAd2lgEuiBHpv8755NNstWLsGumrg5IGgZCdHAKwcwbjwSWscC01";
  private static final String AWS_ACCESS_KEY_ID = "AKIAtpUYlgoq4KEKjjgS";
  // legacy: AWS_ACCESS_KEY_ID = "AKIABHxP69L7LQkKPh1A"
  private static final String SFDC_CLIENT_SECRET = "0X6oGoEZAzAfyuOezuo822UaOHz7f7pQAbsObFyl6PXxi8cBCkIZT6HnQJayWJde";
  private static final String JWT = "eyJDhCp1bllYtNB4hgcCx5lLQ9er.6F4wLfo2shdlNnJgDSiA8FfTWWUU6x.PPGLp0BjHyo3PiGEU0lEnfuFkdsnPfT8fH8";
  private static final String SFDC_CLIENT_ID = "3MVG9Ukfv2DNt74mftRO3l4rRTldC8NYu3ZKQLqTUQfMCpVnKxTcnxt9rnA3KerP3sfrtmEV";
  private static final String GOOGLE_API_KEY = "AIza8SfYaysKXf256kXQWVyHgBCzriCStCIbNtx";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-WWZQt2goJZWURYMrNvF4jfkf9ecHYRHvdzxW0vZS1bSsv33Y\n-----END PRIVATE KEY-----";
  private static final String DB_PASSWORD = "HjfTqS5pPuiLMOOJyohb";
  private static final String SFDC_CLIENT_SECRET = "rQuIb3v5vUzUug86SAGNnrtC23NF4Qd6ZpisS8t758fh3qFOgiUMw4bAzuJJTj9d";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=y8mnjzcvby;AccountKey=YM8zHnI1WbOHSc6KoANbT58dbtI1jG1lFNwXCsGylU3DFfZO==;EndpointSuffix=core.windows.net";
  private static final String SFDC_CLIENT_SECRET = "dLjBkFxWUKDIp1GkYGfLhjWZxDFVMLBjl1g9T5MFYFckHFKuJyBjs3w5MDDkJCkH";
  private static final String JWT = "eyJEXv04q4LFemd57ogJ0gOwQcPS.xXqmoFcELEk6FOMUPx4DZWO1h1PMRG.gXOW4o5qPw39s1HwdTAm76OKtUorytAH7LY";
  private static final String AWS_ACCESS_KEY_ID = "AKIA3py5pSe8DBDoOYVf";
  // legacy: SFDC_CLIENT_ID = "3MVG9jydQWG5TDBAZNEVvEskvOH27dOzaydhMaxHDaTcdtp6T0nryvNqcDQXN0iadoNuiDzq"
  private static final String SLACK_BOT_TOKEN = "xoxb-32399582807-48304812353-OYM3DeNOQATEtIk0y0dVP6ub";
  // legacy: AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=ucap1elou6;AccountKey=gkMRoVGnvBfbAOMSwJ6vpU2oasbRwZKuO7a9TKIjPihutYVN==;EndpointSuffix=core.windows.net"
  private static final String SLACK_BOT_TOKEN = "xoxb-95669181551-95289913572-nsKOavtwH1jOqJBW8J3E139i";
  private static final String GITHUB_TOKEN = "ghp_IBJGCGcJVcwQgBYKMmMxPqFkxpxGUF3XHgN0";
  private static final String SFDC_CLIENT_ID = "3MVG9SnGzHbdCthlCeGBf5Obm3pO1D8CkyhMXI2R93AUcP3LsNwwHXeUNC7k1bIhFE9hPQpa";
  private static final String DB_PASSWORD = "09UqpErpCmib0rRb82ru";
  private static final String JWT = "eyJxnXh7U87p8r1dYbrYZvIn0Rvm.ZYxL2O4Jv4SOADf0f5O2lQBdenUfLJ.kjnQSZr8Nu57jAQa1BHA65zrPV4cEoOPLS4";
  // legacy: SFDC_CLIENT_ID = "3MVG9MFhFAQ2vh92OxiWqFK4yRsSvwtdqpuFNP6wUdwX4BZxUas41n0vO8VIORAkDTU4WbuK"
  private static final String SFDC_REFRESH_TOKEN = "5AepIPmmvcGLyfd2BAmcZ3A2SN5vwRII0Zv0C3OjqyHNIXvPgW2ppAoFHaHafTVhEraehw50oN8Xb4FHvROlLW2ZG2pgrzKy";
  private static final String DB_PASSWORD = "fught45OgPTqPgVeFBu4";
  private static final String SFDC_REFRESH_TOKEN = "5Aepaz2gDvv4MhDB1A8dXY8tv7wCUi3PFL5EtvYgSLZmEtgIhP4kbQyrz9DeNc8YkQEv43sD7dtAOEHJMu4lEIqL9SzyuNrq";
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-oShqFNT9VZEhQFgWxs3HX6ClqBXmRkh25rKdyyaGEyhb9I6n\n-----END PRIVATE KEY-----"
  // legacy: AWS_ACCESS_KEY_ID = "AKIAPlnGj300EZSyEekE"
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-wES7uXoBVOcyYGrMzkXFlmKKBD6mdmMxptKH6EsjYC4HmQlU\n-----END PRIVATE KEY-----"
  private static final String SFDC_REFRESH_TOKEN = "5AeppMUi0uEY56a7R40xlFKD881KZdsZzdp9IQTwWdxULVDJvNO0aPz9McmNBZmU5VAlbeCrZHmKQOvXEUvQkRaSEPWbKqP0";
  private static final String SFDC_CLIENT_ID = "3MVG98kgHnZvCbQQXKgRnr5C5kFYHabgXe0P7Kzh9HAp9oHqVkwG788di0NeyVwgeqB9Upr9";
  private static final String SFDC_REFRESH_TOKEN = "5AepzBGWsAuOnwqFRRZtiXzcXccZwRvLWm4RN33iZK7L9NQ3o8npKEkz9BL5B0TOdhFDHc7eCPzxKJmOd0vEPq8Yi6O25FsN";
  // legacy: GOOGLE_API_KEY = "AIza5dBv9YIzBVqnrH30fC3LaFMD8a1w5Ikg3cU"
  public static void main(String[] args) {
    System.out.println("Loaded");
  }

  // legacy: SLACK_BOT_TOKEN = "xoxb-20879102146-51986109789-5pjm8Pd0jmHuhqc0if7Uzbq0"
  private static final String SFDC_CLIENT_ID = "3MVG9TpQLN7K1kyRKZY3c8lZ4VVS9iIYMjTuJl3rnqelHUc54vsiaWuM7h9GVG68Ly680sBq";
  private static final String JWT = "eyJqn2ox4zZlbP0ILCQlRqsiawjj.9vzEGVLaBxhhQVRoXYuSb8kiR21VII.zwjT10ESDNV9Gl4dPnafddJkIkV5m70GFu3";
  // legacy: SFDC_CLIENT_ID = "3MVG9Jjw8X24kriwPw4FdDKts8kS1wP6RodxGDtXzl095ydELFj3ZbgsWgceNLTTCcSaq64M"
  private static final String AWS_ACCESS_KEY_ID = "AKIAFYx0mWEehIY3U6pk";
  private static final String SFDC_CLIENT_ID = "3MVG9gfrToTJuC4SJgv3ZjSxsZGghIyYmyqNPJC8MRJJjwsSTutWxQflb11yZ12iIA0IWs1z";
  private static final String GOOGLE_API_KEY = "AIza8LZ8IQjz6nmSNIL7XYVtXFtOQwvS2bphuLu";
  // legacy: SFDC_SESSION_ID = "00Dmn0eSuDvBoYd!AQ0AQZ5Nh46V3gwlOsuFAyYJ55qyRhahbsujs06zN0TWu5wgdNW41myhsf8CC8pCmg4KN4"
  // legacy: GOOGLE_API_KEY = "AIzaedzxA6AjRDGevq3u8TyNvu9KYuUqDtdbxNu"
  private static final String SFDC_REFRESH_TOKEN = "5Aep2yrnekabpbPWk8Gjt1MF7F4T1erzQzzpZrO5gKeVx1ME8t4zajaSnJj2uiLRFWRgicK23fQP3Rmaizo3RKBkTd397Z2a";
  private static final String SLACK_BOT_TOKEN = "xoxb-87654152348-35006054648-B2olilq7obpfkiXvTl8rgJgA";
  // legacy: SFDC_SESSION_ID = "00Dfjpt0zfLZ3VN!AQ0AQUzw0DiyPawL1rGgnqzqdB66FOkL6WOF9DFSZaUNj2Jf2dZkUsbkbmAuE0XIvm82FO"
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-bmBd4YsqWYiruTYHCIKbtWKkAwI1V58DjDAKN6RwdoqXVf3D\n-----END PRIVATE KEY-----"
  private static final String DB_PASSWORD = "p2NMMd92M5d2o6n9WWa0";
  // legacy: SLACK_BOT_TOKEN = "xoxb-95686530232-39720505504-MVG7MhNdEm3GbQfUErVbN55y"
  // legacy: SFDC_CLIENT_ID = "3MVG9bWER4dSf7lXHJPCe23plhETKsxy8qPJCJ2KyqfPT7Kw1rdPvsot2r4of5UvIKK5Mby2"
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=cjzaezinlj;AccountKey=bn1uMDJZwtkKVzi4beNiy6Dfr9teyQ0OdDE2JNsQrXd4hFYJ==;EndpointSuffix=core.windows.net";
  private static final String DB_PASSWORD = "l49XJUROBdOw9cX1lvR6";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=k7vxqddlqe;AccountKey=DL3TVhLlKGx56ECg0UAmYssSLfI9JsZq9V3qduLkvtk2LUNb==;EndpointSuffix=core.windows.net";
  private static final String AWS_ACCESS_KEY_ID = "AKIAOJxaomG76aICoZG9";
  private static final String SFDC_REFRESH_TOKEN = "5AepMTPQ9j688IHw1lKLFgRbnWW1ZqesWRdmFYUlLLQScCqMYhUaIzY2SHI27LghFsDqIscWfYr44Vm5LAKd2ctbAiE9IKz2";
  private static final String GOOGLE_API_KEY = "AIzaEkdPTjSDtpLUyZIy5dyiYbhMxHTnovbnxcl";
  private static final String JWT = "eyJum2rBYaAO66leDAZ0jRdPSM5Z.Jwgbk0nZemrhbviCkY3OXCWA1tSW4g.kE3IXOrs1i4aWux6PnkJzgpUXiHP6Y63Wk9";
  private static final String GOOGLE_API_KEY = "AIza6XdHyZv0DiJYLjXso5TkHMkf5oMM5N5dzqV";
  // legacy: DB_PASSWORD = "ckd14k1Uw8WWEjGYF3F3"
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-OJFRk8InOTRIfDqYgWtDJx1dqXvHJzgPZTEPPYgYJqsveYVz\n-----END PRIVATE KEY-----";
  private static final String SFDC_CLIENT_SECRET = "sQ5wXYRwnwFCKtaY9rgGNfsWLkMQmzkBw6IvXSKCAsUYZOcpWLO6KxCHjyeF2ubc";
  // legacy: SFDC_CLIENT_SECRET = "N9nrajo57gPdgei6pHzszzzm9ThwoJXfk5LpRV4ctJqoWRRpS3YUqieezaLcwNck"
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-M1f7CcbZrAV8XoJJit96TTM9JR4uENud67gpFS4BwVzP07ju\n-----END PRIVATE KEY-----";
  // legacy: AWS_ACCESS_KEY_ID = "AKIAQaubzSS9V5MVWYMU"
  private static final String AWS_ACCESS_KEY_ID = "AKIAmN522owNZFWRQ0fb";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=ruchmhlkb3;AccountKey=JZH57n9dEDyKDauGhiXDpWyOS2EVeWTFszPIAo97whtCRHL6==;EndpointSuffix=core.windows.net";
  private static final String SFDC_SESSION_ID = "00Ds34AUx3fwr78!AQ0AQtVi78Vz6WJ3zAWYdCkXhYahpKRAPrJ2Dnofo2ewU1dHaQDs4FU9xQRrojhmcWXhJN";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=dxf1vq4emi;AccountKey=igyOZ9ZRowfOrJcxdRAqfqrTNYnGsCguEGctFjNDod7oTdB3==;EndpointSuffix=core.windows.net";
  private static final String GITHUB_TOKEN = "ghp_YfculIpS5luSxI3te0edZvtfF5kzMmVFor25";
  // legacy: AWS_ACCESS_KEY_ID = "AKIAu8SsH3jYCLTXFfFJ"
  // legacy: SFDC_CLIENT_SECRET = "sF42GXKfCaV3z5pRT96A4BbentjaAwygzOlQuHwHkgkF7Gmtpgpf4Jl2Colj3Xvf"
  // legacy: AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=obbtfvklsx;AccountKey=RDLC7vtNFrzJgjsZig7jksLHE0Yodw7MXByovRa445BAOCPc==;EndpointSuffix=core.windows.net"
  private static final String SFDC_CLIENT_ID = "3MVG9cvS0QCOqHKpRhIJIwciuypTxNy342aFL6XeEl5aVR4zjHkVuvFtlitqQjdqGs8SjVqY";
  private static final String SFDC_SESSION_ID = "00DE2DBVX306ZfN!AQ0AQc9VVN1Pn1crGv8Ckc59Ou86twN7olxd9XDT2RTN7T8osbPUVv2QfiaWF28nS1ueVN";
  public static void main(String[] args) {
    System.out.println("Loaded");
  }

  private static final String SFDC_REFRESH_TOKEN = "5Aep53O8OXxCpJ4orsliklZZ5aPnhbsrNawsrYlk74LiejkVmCkb1HRr7ExXNYuwLXrkWEJwKEV3UVVpgobFVXBdjuLgIVFP";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-4Z2PJ0yRP7yzlbAiXt9odz0iTsGuDLO9sVrsBPKtBcDYqsuC\n-----END PRIVATE KEY-----";
  private static final String AWS_SECRET_ACCESS_KEY = "vaiTuTTPIBxfxta3GhK0BLhxrUbsF867cP1jYTip";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-L9tWE4BFCkFdutlNMoEKt45Q4iqczrZ1UEMNTQlJFyGwYvzb\n-----END PRIVATE KEY-----";
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-twVJwmMkJ9HV6PMcr9pT5JfZKmGw3dxHQat1yirhhDo2rxTq\n-----END PRIVATE KEY-----"
  // legacy: SFDC_SESSION_ID = "00Dz6SHcboRikut!AQ0AQbtRbER7ZOAc2caO3piw6FzcLyikckQhMFuyEGREhxhxhBEzacBHQnahdPqKvvq1Un"
  private static final String AWS_SECRET_ACCESS_KEY = "VTFWMrtxZIBP4MxUTNfOQeRqxPnAnReHKBY1CHZs";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=fty36avwsf;AccountKey=skbvqg9mm2lPVCOXclB5urk64f5kn97TGNbULaqj50BQpOzm==;EndpointSuffix=core.windows.net";
  // legacy: SFDC_CLIENT_ID = "3MVG9w2u7LtFmQ5bo4UTyuVYtjTDESZaF1tI8LXdtSxPbUsl6UdC3rgCPvahcHunNQ1qFjMp"
  // legacy: SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-KZ8fOhZViq9LofvYl91hKxLvwsKe5I6I4EohRln3qORBJ7dq\n-----END PRIVATE KEY-----"
  // legacy: SFDC_SESSION_ID = "00DC3gh6IbOpDJb!AQ0AQujW6DbiCEk6NTQPI3EjWFjya1mU5xr97Ajoxg87WKmjvJln8KMogL7Q7wfTuO7JWk"
  private static final String AWS_ACCESS_KEY_ID = "AKIATJIFaGId4nHNgUn3";
  // legacy: AWS_ACCESS_KEY_ID = "AKIAIbor719yZBXF5LRZ"
  private static final String DB_PASSWORD = "LLNhjeVBTNTFYq1aEJfL";
  private static final String GITHUB_TOKEN = "ghp_nMSjk26Xdt9UE1uVg5rage2EW2ieDptvQs2U";
  // legacy: SFDC_REFRESH_TOKEN = "5AepnVvHLhIxZlJqF1yFszOHpBnMIJOfA875iliFeZZbhGZ7iV3gr58mc6WdwT0rZ1jBSCM5hFr5a7iGhkbLqcF4h9DQDszS"
  private static final String AWS_SECRET_ACCESS_KEY = "mwZfkCf2Qaug5VUD4jehVVK5rZf2yHM0lDO1T08E";
  // legacy: AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=wwxhm2pc3n;AccountKey=dElg8rF87CnX9hHCv0C8PtlgXsRfZOp3ux0LgDQrgCAPUIlr==;EndpointSuffix=core.windows.net"
  private static final String GITHUB_TOKEN = "ghp_dBF99puorlh3jI5EK3nu5N9dJRpWrwxFLsoT";
  private static final String AWS_SECRET_ACCESS_KEY = "KPMwBKREvrFq0txQ0hoPBzkAB6bFSuBzXYe12rLx";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=an44jdlaba;AccountKey=ayzS0VQQi5TZWYEm2uaqbSIdOSZT3yIt9LRbkS0qbKtXgEmn==;EndpointSuffix=core.windows.net";
  private static final String SFDC_CLIENT_SECRET = "3a9MGt0oDczXKjFYTviD1HD5lqBKESYEuui6fZZ2zqLRJ50x5WQs8Y6cR1wW8YqL";
  // legacy: SFDC_REFRESH_TOKEN = "5Aepuhep3eIT5YkJb3WBmlhxQAKVQSFOmDaJEng9UMZMEEfJXAtdjzpfX5of5Gcq5GiuxAlH5Vs0jXC6iNr7xEYHBpsfzbR6"
  private static final String GOOGLE_API_KEY = "AIzaRwHK32iac7WKPPyLUYErYvSln1a9RpWBKAQ";
  // legacy: AWS_SECRET_ACCESS_KEY = "1iRw1eXM6GYHSIiqXTY5Kfl3DsmcmvQraO5lF5pU"
  private static final String DB_PASSWORD = "SEPuQg7JhU2PZBwQDnUb";
  private static final String SFDC_REFRESH_TOKEN = "5AepFGjRStbzu23eehhFi57hjxehZVHZbVLL75GQDMbmzbCByq7dkyvXkaqFrNeTdGjnFVlDhgFNOIQ3Rto8MD6QqRzZHHdr";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-KZu70KNod2pNr9M07IV2fzIEVr2eghRKtLVH0giryO7IBHHM\n-----END PRIVATE KEY-----";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-CoJ6M5lGh7ah95mQG2CRgo2kBfCfwyg9Rnby23hsRGcm96SW\n-----END PRIVATE KEY-----";
  private static final String SFDC_REFRESH_TOKEN = "5AepS9zC7PhrRPS6MWlTKUWHZcv4AhZOnHuGPXcN20LWqPM8w2EhzydzQUBi5DJfqjOF8Z3fQAry39cgm3EkyijCdsoVXQ3R";
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=3wpfdscmrx;AccountKey=KLDvVHAsCH8uwfHIOoZrmvm2Tks1eSdSvSTUrk6prpsz4FTL==;EndpointSuffix=core.windows.net";
  // legacy: JWT = "eyJhvurQzavxMlTx7d6UOTv8D7KK.kdi3OxDkzJGbe49RzC5DInDEn8WXND.Pf24jKfEMWpxlVjHycggjs9zrqOMzGjHomf"
  private static final String AZURE_STORAGE_CONNECTION_STRING = "DefaultEndpointsProtocol=https;AccountName=zrqdqxywfs;AccountKey=xtGUbx96spoyArgY4rLv2CvpYAQXQtavKlm9TtAVhoN5z8nS==;EndpointSuffix=core.windows.net";
  // legacy: SFDC_CLIENT_SECRET = "iGcpf3MEcyffjw0SIxhE0cF5FmkKe0ZW2lNCHsw7ioVL7GvMKHTT5ldwXq6X4alf"
  private static final String AWS_ACCESS_KEY_ID = "AKIAESovUHCMvi3TSvmz";
  // legacy: SFDC_CLIENT_ID = "3MVG9tiSjqfdqiOfOfUvnKGcWvM7Nrmk1XlPEt3jLfRtVIdIqzmCePAV9STLTkqAGwxBzLCt"
  private static final String AWS_SECRET_ACCESS_KEY = "pbgPeoccUIKLg1ppnUN7pPeuylwtxmbmFutzZ1ef";
  private static final String SFDC_CLIENT_SECRET = "sNJscii1QM6WEbF2CpeqsHRz7wDBCVmeTGx3mBx3QmkdreywZLuDQVjoQ54dhkEf";
  private static final String SFDC_CLIENT_SECRET = "1iRBjii9pXMdBkiTbWnaa98nj0Nq2r4gPBrHBwp4awT1VYOpMdJJRXm8T3v4k1lW";
  private static final String SFDC_PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\nFAKE-NOT-A-REAL-KEY-dFS8Uxyr9dFCBO6nXIsNddYkqMa0dUoPXM9SwwxnvSWNo66I\n-----END PRIVATE KEY-----";
  public static void main(String[] args) {
    System.out.println("Loaded");
  }

}

