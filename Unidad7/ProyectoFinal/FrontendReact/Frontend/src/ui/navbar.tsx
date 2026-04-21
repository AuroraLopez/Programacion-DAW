import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import Inicio from '../sections/Inicio';

export default function Navbar() {
  return (
    <AppBar position="static" color="transparent" elevation={0}>
      <Toolbar>
        <Typography variant="h6" sx={{ flexGrow: 1 }}>
          Game
        </Typography>
        <Button color="inherit" href="../sections/Inicio">Inicio</Button>
        <Button color="inherit">Listado</Button>
        <Button variant="contained">CV</Button>
      </Toolbar>
    </AppBar>
  );
}