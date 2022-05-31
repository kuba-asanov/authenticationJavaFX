# This is an authentication application with JavaFX witch works with database(MSSQL Server).

JavaFX authorization application works with database(SQL Server), users can login to the home page if they have their own account that has been registered, or they can register and login to the home page first. All data (username, login, password) is stored in SQL Server.

## Teammates: Bakyt Ikramov and Kubanych Asanov

## Some screens:
### authorization page
![authorization page](https://i.imgur.com/EU2VSMq.png)
### sign up page
![sign up page](https://i.imgur.com/1lozgne.png)

## The schema:

### Users
```
┌─────────────┬─────────┬───────┐
│ users       │ type    │ extra │
├─────────────┼─────────┼───────┤
│ email       │ string  │       │
│ password    │ string  │       │
│ name        │ string  │       │
| surname     | string  | link  |
| userId      | objectId| auto..|
| dateAdded   | Date    | auto..|
└─────────────┴─────────┴───────┘
```
## ‍👨‍💻 ‍Contacts...

<a href="https://www.instagram.com/kuba.asanovv/"><img src="https://img.icons8.com/color/48/000000/instagram" width="60"></a>
<a href="https://www.linkedin.com/in/kubanych-asanov-07394b1b4/"><img src="https://img.icons8.com/color/48/000000/linkedin-circled.png" width="60"></a>
<a href="https://www.youtube.com/channel/UCneGkwC2dxnOc10q1Zlc0GQ"><img src="https://img.icons8.com/color/48/000000/youtube-play.png" width="60"></a>
<a href="https://kuba.go.kg/"><img src="https://img.icons8.com/ultraviolet/40/000000/domain.png" width="60"></a>
