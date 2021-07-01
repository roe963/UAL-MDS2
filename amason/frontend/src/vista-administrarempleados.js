import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-agregarempleado.js';
import './vista-encargadosdecompras.js';
import './vista-empresasdetransportes.js';

class VistaAdministrarempleados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
<h3 style="margin-left: var(--lumo-space-xl);">Administrar Usuarios Empleados</h3>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="layout-anadirUsuario" style="flex-grow: 1; align-items: stretch; width: 100%; height: 100%; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-xl);">
  <vista-agregarempleado></vista-agregarempleado>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 150%; flex-grow: 1; height: 80%;">
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: stretch; width: 100%; height: 100%; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m);">
    <h4>Encargado de compras</h4>
    <vaadin-horizontal-layout theme="spacing" id="layout-encargadoCompras">
     <vista-encargadosdecompras></vista-encargadosdecompras>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: stretch; width: 100%; height: 100%; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-m);">
    <h4>Empresa de transportes</h4>
    <vaadin-horizontal-layout theme="spacing" id="layout-empresaTransportes">
     <vista-empresasdetransportes></vista-empresasdetransportes>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button id="button-guardar" style="align-self: center;">
    Guardar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarempleados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarempleados.is, VistaAdministrarempleados);
