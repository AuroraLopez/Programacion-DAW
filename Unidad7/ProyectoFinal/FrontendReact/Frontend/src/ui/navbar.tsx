import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import Inicio from '../sections/Inicio';
import Productos from '../sections/Productos';

export default function Navbar() {
  return (
    <nav style={{ display: "flex", alignItems: "center", justifyContent: "space-between", padding: "1.2rem 0", borderBottom: "1px solid rgba(0,245,212,.1)", marginBottom: "3rem" }}>
      <span style={{ fontWeight: 900, fontSize: "1.2rem", color: "#acfffe", letterSpacing: 2 }}>
        Ga<span style={{ color: "#f72585" }}>Me</span>
      </span>
      <div style={{ display: "flex", gap: "2rem" }}>
        <a href="Productos" style={{ color: "#8892a4", textDecoration: "none", fontWeight: 600 }}>Juegos</a>
        <a href="#" style={{ color: "#8892a4", textDecoration: "none", fontWeight: 600 }}>CV</a>
      </div>
      <button style={{ background: "linear-gradient(135deg,#00f5d4,#7b2fff)", border: "none", borderRadius: 7, color: "#080c14", fontWeight: 700, padding: ".5rem 1.2rem", cursor: "pointer" }}>
        🛒 Carrito
      </button>
    </nav>
  );
}