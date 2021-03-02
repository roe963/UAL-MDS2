import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrarcategorias`
 *
 * VistaAdministrarcategorias element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarcategorias extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-administrarcategorias';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarcategorias.is, VistaAdministrarcategorias);
